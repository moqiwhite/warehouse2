package com.powerengineering.examinationsystem.dao;
import com.powerengineering.examinationsystem.model.entity.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppDao {

    List<Apply> getAllApp();

    Apply getAppid(@Param("id") int id);

    int updApp(@Param("id")int id , @Param("name")String name, @Param("yun")String yun, @Param("grade")String grade, @Param("createTime")String createTime, @Param("uId")Integer uId);

    int delApp(@Param("id")int id);

    int addApp(@Param("name") String uname, @Param("yun") String yun, @Param("grade") String grade, @Param("uId") Integer uId, @Param("createTime")String createTime, @Param("explain") String explain);
}
