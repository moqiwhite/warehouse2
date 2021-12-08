package com.powerengineering.examinationsystem.service.impl;

import com.powerengineering.examinationsystem.dao.AppDao;
import com.powerengineering.examinationsystem.model.entity.Apply;
import com.powerengineering.examinationsystem.service.AppService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Resource
    private AppDao appDao;

    @Override
    public List<Apply> getAllApp() {
        return appDao.getAllApp();
    }

    @Override
    public Apply getAppid(int id) {
        return appDao.getAppid(id);
    }

    @Override
    public boolean updApp(int id, String name, String yun, String grade, String createTime, Integer uId) {

        int i = appDao.updApp(id, name, yun, grade, createTime, uId);
            if (i>0){
                return true;
            }else {
                return false;
            }
    }

    @Override
    public boolean delApp(int id) {

        int i = appDao.delApp(id);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean addApp(String name, String yun, String grade,Integer uId,String createTime,String explain) {
        int i = appDao.addApp(name, yun, grade, uId,createTime,explain);
        if (i>0){
            return true;
        }
        return false;
    }
}
