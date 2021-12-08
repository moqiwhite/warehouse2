package com.powerengineering.examinationsystem.dao;

import com.powerengineering.examinationsystem.model.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagDao {

    List<Tag> getAllTag();

    Tag getTagid(@Param("id") int id);

    int updTag(@Param("id")int id ,@Param("tname")String Tname);

    int addTag(@Param("tname") String tname);

    int delTag(@Param("id")int id);

}
