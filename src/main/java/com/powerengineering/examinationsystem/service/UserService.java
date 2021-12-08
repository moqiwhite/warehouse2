package com.powerengineering.examinationsystem.service;


import com.powerengineering.examinationsystem.model.entity.User;

import java.util.List;

public interface UserService {

    boolean addUser(String name,String phone,String card,String pwd,String mail);


    User login(String card, String pwd);


    boolean getExistphone(String phone);
    boolean getExistCard(String card);
    boolean getExistMail(String mail);
    boolean getExistName(String name);

    //拿到所有的用户
    List<User> getUser();


}
