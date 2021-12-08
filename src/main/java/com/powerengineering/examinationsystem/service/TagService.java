package com.powerengineering.examinationsystem.service;

import com.powerengineering.examinationsystem.model.entity.Tag;

import java.util.List;

public interface TagService {

    List<Tag> getAllTag();

    Tag getTagid(int id);

    boolean updTag(int id ,String tname);

    boolean addTag(String tname);

    boolean delTagByid(int id);



}
