package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.model.entity.Apply;
import com.powerengineering.examinationsystem.service.AppService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AppController {

    @Resource
    private AppService appService;

    @RequestMapping("/touserRegistration")
    public String touserRegistration(HttpServletRequest request){
        List<Apply> applyList = appService.getAllApp();
        request.setAttribute("applyList",applyList);
        return "userRegistration";
    }

    @RequestMapping("/getAppid")
    public String getAppid(int id,HttpServletRequest request){
        Apply apply = appService.getAppid(id);
        request.setAttribute("apply",apply);
        return "upduserRegistration";
    }

    @RequestMapping(value = "/updApply",method = RequestMethod.POST)
    public String updApply(int id, String name, String yun, String grade, String createTime, Integer uId){
    boolean i = appService.updApp(id, name, yun, grade, createTime, uId);
    if (i){
        return "redirect:/touserRegistration";
    }
        return "upduserRegistration";

    }
    @RequestMapping("/delApply")
    @ResponseBody
    public String delApply(int id){
        boolean b = appService.delApp(id);
        if (b){
            return "success";
        }else {
            return "failed";
        }
    }

    @RequestMapping("/tianuserRegistration")
    public String tianuserRegistration(HttpServletRequest request) {
        List<Apply> applyList = appService.getAllApp();
        request.setAttribute("applyList", applyList);
        return "tianuserRegistration";
    }
    @RequestMapping(value = "/doApp",method = RequestMethod.POST)
    public String doApp(String name, String yun, String grade,Integer uId ,String createTime,String explain,HttpServletRequest request){
        boolean b = appService.addApp(name,yun,grade,uId,createTime,explain);
        if (b){
            request.setAttribute("info","添加成功");
        }else{
            request.setAttribute("info","添加失败");
        }
        return "redirect:/touserRegistration";
    }

}
