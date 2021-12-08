package com.powerengineering.examinationsystem.service;

import com.powerengineering.examinationsystem.model.entity.Apply;

import java.util.List;

public interface AppService {

    List<Apply> getAllApp();

    Apply getAppid(int id);

    boolean updApp(int id,String name,String yun,String grade,String createTime,Integer uId);

    boolean delApp(int id);

    boolean addApp(String name,String yun,String grade,Integer uId,String createTime,String explain);

}
