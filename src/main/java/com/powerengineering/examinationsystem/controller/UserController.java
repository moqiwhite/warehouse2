package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.model.entity.User;
import com.powerengineering.examinationsystem.service.UserService;
import com.powerengineering.examinationsystem.utils.CommentUtils;
import com.powerengineering.examinationsystem.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@Controller
public class UserController {

    @Autowired
    private CommentUtils commentUtils;
    @Autowired
    private RedisUtils redisUtils;
    @Resource
    private UserService userService;

    @RequestMapping("/conPwd")
    public void conPwd(String pwd1, String pwd2, HttpServletResponse response){
        String data;
        if(pwd1.equals(pwd2)){
            data="ok";
        }else{
            data="no";
        }
        try{
            PrintWriter pw = response.getWriter();
            pw.write(data);
            pw.flush();
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping("/getCode")
    public void getCode(String mail,HttpServletResponse response) {
        try {
            String data;
            PrintWriter pw = response.getWriter();
            int code = commentUtils.getCode();
            if(commentUtils.sendCode(mail,code)){
                redisUtils.set(mail,30*60,code+"");
                data="ok";
            }else{
                data="no";
            }
            pw.write(data);
            pw.flush();
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @RequestMapping("/signDo")
    public String signDo(String name, String phone, String card, String pwd1, String mail, String code, HttpServletRequest request){
        String getCode = (String)redisUtils.get(mail);
        if(getCode.equals(code)){
            //验证码正确
            userService.addUser(name,phone,card,pwd1,mail);
        }else{
            //验证码错误
            request.setAttribute("msg","验证码错误");
            return "loginZC";
        }

        return "login";
    }


    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(String card , String pwd, HttpSession session,HttpServletRequest request){
       User user = userService.login(card, pwd);
        if(null!=user){
            session.setAttribute("user",user);
            return "index";
        }else{
            request.setAttribute("msg","账号或密码错误");
            return "login";
        }
    }

    @RequestMapping("/conPhone")
    public void conPhone(HttpServletResponse response,String phone)throws Exception{
        System.out.println(phone);
        PrintWriter pw = response.getWriter();
        String data=null;
        if(userService.getExistphone(phone)){
            data="ok";
        }else{
            data="no";
        }
        pw.write(data);
        pw.flush();
        pw.close();
    }

    @RequestMapping("/conCard")
    public void conCard(HttpServletResponse response,@RequestParam(value = "card",required = false,defaultValue = "") String card)throws Exception{
        System.out.println(card);
        PrintWriter pw = response.getWriter();
        String data=null;
        if(userService.getExistCard(card)){
            data="ok";
        }else{
            data="no";
        }
        pw.write(data);
        pw.flush();
        pw.close();
    }
    @RequestMapping("/conMail")
    public void conMail(HttpServletResponse response,@RequestParam(value = "mail",required = false,defaultValue = "") String mail)throws Exception{
        System.out.println(mail);
        PrintWriter pw = response.getWriter();
        String data=null;
        if(userService.getExistMail(mail)){
            data="ok";
        }else{
            data="no";
        }
        pw.write(data);
        pw.flush();
        pw.close();
    }

    @RequestMapping("/conName")
    public void conName(HttpServletResponse response,@RequestParam(value = "name",required = false,defaultValue = "") String name)throws Exception{
        System.out.println(name);
        PrintWriter pw = response.getWriter();
        String data=null;
        if(userService.getExistName(name)){
            data="ok";
        }else{
            data="no";
        }
        pw.write(data);
        pw.flush();
        pw.close();
    }

}




