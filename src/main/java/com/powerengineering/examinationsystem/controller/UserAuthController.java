package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.dao.UserDao;
import com.powerengineering.examinationsystem.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

//用户管理界面的方法
@Controller
public class UserAuthController {
    @Resource
    private UserDao userDao;

    @RequestMapping("/touserAuth")
    public String touserAuth(HttpServletRequest request) {
        List<User> userList = userDao.getAllUser();
        request.setAttribute("userList", userList);
        return "userAuth";
    }
    @RequestMapping("/touserAuthOne")
    public String touserAuthOne(HttpServletRequest request) {
        List<User> userListOne = userDao.getAllUserAuthOne();
        request.setAttribute("userListOne", userListOne);
        return "userAuthOne";
    }
    @RequestMapping("/touserAuthTwo")
    public String touserAuthTwo(HttpServletRequest request) {
        List<User> userListTwo = userDao.getAllUserAuthTwo();
        request.setAttribute("userListTwo", userListTwo);
        return "userAuthTwo";
    }
    @RequestMapping("/touserAuthThree")
    public String touserAuthThree(HttpServletRequest request) {
        List<User> userListThree = userDao.getAllUserAuthThree();
        request.setAttribute("userListThree", userListThree);
        return "userAuthThree";
    }

    @RequestMapping("/toAddUserAuth")
    public String toAddUserAuth() {
        return "userAdd";
    }

    @RequestMapping("/toAddUserAuthOne")
    public String toAddUserAuthOne() {
        return "userAddOne";
    }

    @RequestMapping("/toAddUserAuthTwo")
    public String toAddUserAuthTwo() {
        return "userAddTwo";
    }

    @RequestMapping("/toAddUserAuthThree")
    public String toAddUserAuthThree() {
        return "userAddThree";
    }

    @RequestMapping(value = "/addUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUser(User user, HttpServletRequest request) {
        int i = userDao.addUserAuth(user);
        if (i > 0) {
            return "/touserAuth";
        } else {
            return "userAdd";
        }
    }

   @RequestMapping(value = "/addUserAuthOne", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUserAuthOne(User user, HttpServletRequest request) {
        int i = userDao.addUserAuthOne(user);
        if (i > 0) {
            return "/touserAuthOne";
        } else {
            return "userAdd";
        }
    }

     @RequestMapping(value = "/addUserAuthTwo", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUserAuthTwo(User user, HttpServletRequest request) {
        int i = userDao.addUserAuthTwo(user);
        if (i > 0) {
            return "/touserAuthTwo";
        } else {
            return "userAdd";
        }
    }

    @RequestMapping(value = "/addUserAuthThree", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUserAuthThree(User user, HttpServletRequest request) {
        int i = userDao.addUserAuthThree(user);
        if (i > 0) {
            return "/touserAuthThree";
        } else {
            return "userAdd";
        }
    }


    @RequestMapping(value = "/selectUserAuthById", method = {RequestMethod.POST, RequestMethod.GET})
    public String selectUserAuthById(int id, HttpServletRequest request) {
        User user = userDao.selectUserAuthById(id);
        request.setAttribute("userList", user);

        return "updUserAuth";
    }

    @RequestMapping(value = "/selectUserAuthOneById", method = {RequestMethod.POST, RequestMethod.GET})
    public String selectUserAuthOneById(int id, HttpServletRequest request) {
        User user = userDao.selectUserAuthById(id);
        request.setAttribute("userList", user);

        return "updUserAuthOne";
    }

    @RequestMapping(value = "/selectUserAuthTwoById", method = {RequestMethod.POST, RequestMethod.GET})
    public String selectUserAuthTwoById(int id, HttpServletRequest request) {
        User user = userDao.selectUserAuthById(id);
        request.setAttribute("userList", user);

        return "updUserAuthTwo";
    }

    @RequestMapping(value = "/selectUserAuthThreeById", method = {RequestMethod.POST, RequestMethod.GET})
    public String selectUserAuthThreeById(int id, HttpServletRequest request) {
        User user = userDao.selectUserAuthById(id);
        request.setAttribute("userList", user);

        return "updUserAuthThree";
    }

    @RequestMapping(value = "/updateUserAuthById", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateUserAuthById(HttpServletRequest request, int userId, int userAuth, int kaochangId, int unitId, String userName, String userCard, String userPhone, String userMail, String userPassword) {
        int i = userDao.updateUserAuthById(userAuth, kaochangId, unitId, userName, userCard, userPhone, userMail, userPassword, userId);
        if (i > 0) {
            List<User> userList = userDao.getAllUser();
            request.setAttribute("userList", userList);
            return "/touserAuth";
        } else {
            return "updUserAuth";
        }
    }

    @RequestMapping(value = "/updateUserAuthOneById", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateUserAuthOneById(HttpServletRequest request, int userId, int userAuth, int kaochangId, int unitId, String userName, String userCard, String userPhone, String userMail, String userPassword) {
        int i = userDao.updateUserAuthById(userAuth, kaochangId, unitId, userName, userCard, userPhone, userMail, userPassword, userId);
        if (i > 0) {
            List<User> userListOne = userDao.getAllUser();
            request.setAttribute("userListOne", userListOne);
            return "/touserAuthOne";
        } else {
            return "updUserAuthOne";
        }
    }

    @RequestMapping(value = "/updateUserAuthTwoById", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateUserAuthTwoById(HttpServletRequest request, int userId, int userAuth, int kaochangId, int unitId, String userName, String userCard, String userPhone, String userMail, String userPassword) {
        int i = userDao.updateUserAuthById(userAuth, kaochangId, unitId, userName, userCard, userPhone, userMail, userPassword, userId);
        if (i > 0) {
            List<User> userListTwo = userDao.getAllUser();
            request.setAttribute("userListTwo", userListTwo);
            return "/touserAuthTwo";
        } else {
            return "updUserAuthTwo";
        }
    }

    @RequestMapping(value = "/updateUserAuthThreeById", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateUserAuthThreeById(HttpServletRequest request, int userId, int userAuth, int kaochangId, int unitId, String userName, String userCard, String userPhone, String userMail, String userPassword) {
        int i = userDao.updateUserAuthById(userAuth, kaochangId, unitId, userName, userCard, userPhone, userMail, userPassword, userId);
        if (i > 0) {
            List<User> userListThree = userDao.getAllUser();
            request.setAttribute("userListThree", userListThree);
            return "/touserAuthThree";
        } else {
            return "updUserAuthThree";
        }
    }

    @RequestMapping("/deleteUserAuthById")
    @ResponseBody
    public String deleteUserAuthById(int id, HttpServletRequest request) {
        int i = userDao.deleteUserAuthById(id);
        if (i > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping("/deleteUserAuthOneById")
    @ResponseBody
    public String deleteUserAuthOneById(int id, HttpServletRequest request) {
        int i = userDao.deleteUserAuthById(id);
        if (i > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping("/deleteUserAuthTwoById")
    @ResponseBody
    public String deleteUserAuthTwoById(int id, HttpServletRequest request) {
        int i = userDao.deleteUserAuthById(id);
        if (i > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping("/deleteUserAuthThreeById")
    @ResponseBody
    public String deleteUserAuthThreeById(int id, HttpServletRequest request) {
        int i = userDao.deleteUserAuthById(id);
        if (i > 0) {
            return "success";
        } else {
            return "failed";
        }
    }
}

