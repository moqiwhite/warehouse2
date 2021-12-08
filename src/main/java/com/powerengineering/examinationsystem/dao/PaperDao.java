package com.powerengineering.examinationsystem.dao;

import com.powerengineering.examinationsystem.model.entity.Craft;
import com.powerengineering.examinationsystem.model.entity.Paper;
import com.powerengineering.examinationsystem.model.entity.Tag;
import com.powerengineering.examinationsystem.model.entity.Unit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperDao {
    //拿到所有的单位
    List<Unit> getUnit();
    //拿到所有的标签
    List<Tag> getTag();
    //拿到所有的等级
    List<Craft> getCraft();

    //拿到某个试卷的单位名称
    Unit getUnitById(@Param("id")int id);
    //拿到某个试卷的标签名称
    Tag getTidById(@Param("id")int id);


    //添加试卷
    int addPaper(@Param("pname") String pname,@Param("uid") int uid,@Param("bsid")int bsid,
                 @Param("btid")int btid,@Param("answer")String answer,@Param("bid")int bid,
                 @Param("crid")int crid,@Param("tid")int tid,@Param("mid")int mid,@Param("userId")int userId);

    //查正考或者练习的试卷
    List<Paper> getPaperBtid(@Param("btid") int btid);

    //删除试卷
    int delPaper(@Param("id") int id);

    //用id查到某一个试卷
    Paper updPaperTo(@Param("id") int id);

    //修改试卷
    int updPaper(@Param("uid") int uid,@Param("bsid")int bsid,
                 @Param("btid")int btid,@Param("answer")String answer,@Param("bid")int bid,
                 @Param("crid")int crid,@Param("tid")int tid,@Param("id") int id,@Param("userId") int userId);




}
