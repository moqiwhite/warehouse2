package com.powerengineering.examinationsystem.service;

import com.powerengineering.examinationsystem.model.entity.Unit;

import java.util.List;

public interface UnitService {

    List<Unit> getAllUnit();

    boolean addUnit(String Uname);

    Unit getUniTid(int id);

    boolean updUnit(int id,String Uname);

    boolean delUnit(int id);
}
