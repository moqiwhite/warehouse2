package com.powerengineering.examinationsystem.service;

import com.powerengineering.examinationsystem.model.entity.Craft;
import com.powerengineering.examinationsystem.model.entity.Paper;
import com.powerengineering.examinationsystem.model.entity.Tag;
import com.powerengineering.examinationsystem.model.entity.Unit;

import java.util.List;

public interface PaperService {
    //拿到所有的单位
    List<Unit> getUnit();
    //拿到所有的标签
    List<Tag> getTag();
    //拿到所有的等级
    List<Craft> getCraft();

    //添加
    boolean addPaper(String pname,int uid,int bsid,int btid,String answer,int bid,int crid,int tid,int mid,int userId);
    //查看    正考   或者   练习  的试卷
    List<Paper> getPaperBtid(int btid);

    //删除试卷
    boolean delPaper(int id);

    //用id查到某一个试卷
    Paper updPaperTo(int id);

    //拿到某个试卷的单位名称
    Unit getUnitById(int id);
    //拿到某个试卷的标签名称
    Tag getTidById(int id);


    //修改
    boolean updPaper(int uid,int bsid,int btid,String answer,int bid,int crid,int tid,int id,int userId);



}
