package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.model.entity.*;
import com.powerengineering.examinationsystem.model.vo.PaperVo;
import com.powerengineering.examinationsystem.service.PaperService;
import com.powerengineering.examinationsystem.service.QiniuService;
import com.powerengineering.examinationsystem.service.UserService;
import com.powerengineering.examinationsystem.utils.CommentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class PaperController {

    @Resource
    private PaperService paperService;

    @Autowired
    private CommentUtils commentUtils;

    @Resource
    private UserService userService;

    @Autowired
    private QiniuService qnService;

    @Value("${qiniu.path}")
    private String qnPath;

    @RequestMapping("/initPaper")
    public String selPaper(int btid, HttpServletRequest request){
        List<Paper> paperList = paperService.getPaperBtid(btid);
        List<PaperVo> paperVoList = commentUtils.change(paperList);
        request.setAttribute("paperVoList",paperVoList);
        return "paper";
    }
    /**
     * 这里拿到需要的所有的   用户姓名  单位名称  标签名称
     * 带到去添加的页面,让用户自己选择添加
     * */
    @RequestMapping("/addPaperTo")
    public String addPaperTo(HttpServletRequest request){
        List<Unit> unitList = paperService.getUnit();
        List<Tag> tagList = paperService.getTag();
        List<User> userList= userService.getUser();

        request.setAttribute("userList",userList);
        request.setAttribute("unitList",unitList);
        request.setAttribute("tagList",tagList);
        return "paperAdd";
    }


    /**
     *
     * 这里是用户选择完毕,点击提交了
     * 然后再这个方法里把选择的好的试卷添加到数据库
     *
     * */
    @RequestMapping("/addPaperDo")
    @Transactional
    public String addPaperDo(String pname,int uid,int bsid,int btid,MultipartFile file,
                             int bid,int crid,int tid,int mid,int userId,HttpServletRequest request)throws Exception{

        byte[] bytes = file.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        Map map = qnService.uploadInputStream(inputStream);
        String fileName = (String) map.get("fileName");
        String answer = "Http://"+qnPath+"/"+fileName;
        System.out.println("answer:"+answer);

        if(paperService.addPaper(pname, uid, bsid, btid, answer, bid, crid, tid, mid,userId)){
            request.setAttribute("msg","添加成功");
        }else{
            request.setAttribute("msg","添加失败");
        }

        return "/initPaper";
    }

    /**
     * 这里是删除试卷的方法    用ajax删除的
     *
     * */
    @RequestMapping("/delPaper")
    public void delPaper(int id, HttpServletResponse response){
        String data; 
        if(paperService.delPaper(id)){
            data="ok";
        }else{
            data="no";
        }

        PrintWriter pw = null;
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.write(data);
        pw.flush();
        pw.close();
    }


    /**
     * 这里是去修改的页面  带上需要的参数      用户姓名  单位名称  标签名称  工种等级  和原本试卷的参数
     * 带上他们去修改的页面
     *
     * */

    @RequestMapping("/updPaperTo")
    public String updPaperTo(int id,HttpServletRequest request){

        Paper paper = paperService.updPaperTo(id);//原本试卷的参数
        List<User> userList= userService.getUser();//用户的
        List<Unit> unitList = paperService.getUnit();//单位的
        List<Tag> tagList= paperService.getTag();//标签的
        List<Craft> craftList= paperService.getCraft();//工种等级
        request.setAttribute("userList",userList);
        request.setAttribute("unitList",unitList);
        request.setAttribute("tagList",tagList);
        request.setAttribute("paper",paper);
        request.setAttribute("craftList",craftList);
        return "updPaper";
    }



    /**
     *
     *这里是用户已经准备好修改的参数,点击了确定修改,
     *  在这里我们把数据库的参数进行修改
     *
     *
     * */
    @RequestMapping("/updPaperDo")
    @Transactional
    public String updPaperDo(@RequestParam(value = "file",required = false,defaultValue = "null") MultipartFile file, int id, int bsid, int btid, int bid, int tid, int uid, int crid, int userId)throws Exception{

            byte[] bytes = file.getBytes();
            InputStream inputStream = new ByteArrayInputStream(bytes);
            Map map = qnService.uploadInputStream(inputStream);
            String fileName = (String) map.get("fileName");
            String answer = "Http://"+qnPath+"/"+fileName;
            System.out.println("answer:"+answer);
            boolean b = paperService.updPaper(uid,bsid,btid,answer,bid,crid,tid,id,userId);
//            return "redirect:initPaper";//这里成功应该调到那个点击过的正考或者练习

            return "/initPaper";
    }



}
