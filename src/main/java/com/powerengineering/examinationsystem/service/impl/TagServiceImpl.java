package com.powerengineering.examinationsystem.service.impl;

import com.powerengineering.examinationsystem.dao.TagDao;
import com.powerengineering.examinationsystem.service.TagService;
import org.springframework.stereotype.Service;
import com.powerengineering.examinationsystem.model.entity.Tag;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagDao tagDao;

    @Override
    public List<Tag> getAllTag() {
        return tagDao.getAllTag();
    }

    @Override
    public Tag getTagid(int id) {
        return tagDao.getTagid(id);
    }

    @Override
    public boolean updTag(int id ,String tname) {

        int i = tagDao.updTag(id,tname);
            if (i > 0){
            return true;
        }else{
                return false;
            }
    }

    @Override
    public boolean addTag(String tname) {
        if (tagDao.addTag(tname)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delTagByid(int id) {
        int i = tagDao.delTag(id);
        if (i>0){
            return true;
        }else{
            return false;
        }

    }
}
