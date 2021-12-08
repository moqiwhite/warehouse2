package com.powerengineering.examinationsystem.dao;

import com.powerengineering.examinationsystem.model.entity.Unit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitDao {

    List<Unit> getAllUnit();

    int addUnit(@Param("Uname") String Uname);

    Unit getUniTid(@Param("id") int id);

    int updUnit(@Param("id")int id, @Param("Uname") String Uname);

    int delUnit(@Param("id")int id);
}
