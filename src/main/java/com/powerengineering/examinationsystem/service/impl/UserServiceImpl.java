package com.powerengineering.examinationsystem.service.impl;

import com.powerengineering.examinationsystem.dao.UserDao;
import com.powerengineering.examinationsystem.model.entity.User;
import com.powerengineering.examinationsystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
     private UserDao userDao;



    @Override
    public boolean addUser(String name, String phone, String card, String pwd, String mail) {
        int i = userDao.addUser(name, phone, card, pwd, mail);
        if(i>0){
            return  true;
        }
        return false;
    }

    @Override
    public User login(String card, String pwd) {

        User user = userDao.getUserByCardAndPwd(card, pwd);
        if(null!=user){
            return user;
        }
        return null;
    }

    @Override
    public boolean getExistphone(String phone) {
        User user = userDao.getUserByPhone(phone);
        if(null==user){
            return true;
        }
        return false;
    }

    @Override
    public boolean getExistCard(String card) {
        User user = userDao.getUserByCard(card);
        if(null==user){
            return true;
        }
        return false;
    }

    @Override
    public boolean getExistMail(String mail) {
        User user = userDao.getUserByMail(mail);
        if(null==user){
            return true;
        }
        return false;
    }

    @Override
    public boolean getExistName(String name) {
        User user = userDao.getUserByName(name);
        if(null==user){
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
