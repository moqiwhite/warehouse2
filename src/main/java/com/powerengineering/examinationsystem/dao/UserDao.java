package com.powerengineering.examinationsystem.dao;

import com.powerengineering.examinationsystem.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    int addUser(@Param("name")String name,@Param("phone")String phone,@Param("card")String card,@Param("pwd")String pwd,@Param("mail")String mail);

    User getUserByCardAndPwd(@Param("card")String card,@Param("pwd")String pwd);

    User getUserByPhone(@Param("phone") String phone);
    User getUserByCard(@Param("card") String card);
    User getUserByMail(@Param("mail") String mail);
    User getUserByName(@Param("name") String name);
    List<User> getAllUser();
    List<User> getAllUserAuthOne();
    List<User> getAllUserAuthTwo();
    List<User> getAllUserAuthThree();
    int addUserAuth(User user);
    int addUserAuthOne(User user);
    int addUserAuthTwo(User user);
    int addUserAuthThree(User user);
    User selectUserAuthById(int id);
    int updateUserAuthById(@Param("auth")int auth,@Param("kid")int kid,@Param("uid")int uid,@Param("name")String name,@Param("card")String card,
                @Param("phone")String phone,@Param("mail")String mail,@Param("password")String password,@Param("id")int id);

    int deleteUserAuthById(int id);

    //拿到所有的用户
    List<User> getUser();

    //拿到某个试卷负责人的名字
    String getUserIdById(@Param("id")int id);

}
