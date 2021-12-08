package com.powerengineering.examinationsystem.service.impl;

import com.powerengineering.examinationsystem.dao.UnitDao;
import com.powerengineering.examinationsystem.model.entity.Unit;
import com.powerengineering.examinationsystem.service.UnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    @Resource
    private UnitDao unitDao;

    @Override
    public List<Unit> getAllUnit() {
        List<Unit> unitList = unitDao.getAllUnit();
        return unitList;
    }

    @Override
    public boolean addUnit(String Uname) {
        if (unitDao.addUnit(Uname)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Unit getUniTid(int id) {
        return unitDao.getUniTid(id);
    }

    @Override
    public boolean updUnit(int id,String Uname) {
       int i = unitDao.updUnit(id,Uname);
        if (i>0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean delUnit(int id) {
        int i = unitDao.delUnit(id);
        if (i>0){
            return true;
        }
        return false;
    }
}
