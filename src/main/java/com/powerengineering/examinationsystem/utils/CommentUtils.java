package com.powerengineering.examinationsystem.utils;

import com.powerengineering.examinationsystem.dao.PaperDao;
import com.powerengineering.examinationsystem.dao.UserDao;
import com.powerengineering.examinationsystem.model.entity.Paper;
import com.powerengineering.examinationsystem.model.vo.PaperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class CommentUtils {

    @Autowired
    private JavaMailSender jsm;

    @Resource
    private PaperDao paperDao;

    @Resource
    private UserDao userDao;


    public int getCode(){

        int code = (int)((Math.random()*8999)+1000);
        return code;
    }


    public boolean sendCode(String mail,int code){
        try{
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setFrom("909441854@qq.com");//谁发的

            mailMessage.setTo(mail);//发给谁

            mailMessage.setSubject("注册验证码");//标题

            mailMessage.setText("电力行业人才发展服务平台,验证码为:"+code);//发的内容

            jsm.send(mailMessage);//实现
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<PaperVo> change(List<Paper> paperList){
        List<PaperVo> voList = new ArrayList<>();
        for (Paper p :paperList) {
            PaperVo vo = new PaperVo();
            //名称
            vo.setPnameStr(p.getPName());
            //答案
            vo.setAnswer(p.getAnswer());
            //专业类别
//            vo.setMidStr(Change.getMidChange(p.getMid()));
            //题库类别转换
            vo.setBsidStr(Change.getBsidChange(p.getBsid()));
            //题库类型转换
            vo.setBtidStr(Change.getBtidChange(p.getBtid()));
            //种类转换
            vo.setBidStr(Change.getBidChange(p.getBid()));
            //工种等级转换
            vo.setCridStr(Change.getCridChange(p.getCrid()));
            //单位名称
            vo.setUidStr(paperDao.getUnitById(p.getUid()).getUname());
            //标签名称
            vo.setTidStr(paperDao.getTidById(p.getTid()).getTname());
            //负责人id
            vo.setUserIdStr(userDao.getUserIdById(p.getUserId()));
            //他的id
            vo.setId(p.getId());
            voList.add(vo);
        }

        return voList;
    }




}

