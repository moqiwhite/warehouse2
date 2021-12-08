package com.powerengineering.examinationsystem.service.impl;

import com.powerengineering.examinationsystem.dao.PaperDao;
import com.powerengineering.examinationsystem.model.entity.Craft;
import com.powerengineering.examinationsystem.model.entity.Paper;
import com.powerengineering.examinationsystem.model.entity.Tag;
import com.powerengineering.examinationsystem.model.entity.Unit;
import com.powerengineering.examinationsystem.service.PaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperDao paperDao;


    @Override
    public List<Unit> getUnit() {
        return paperDao.getUnit();
    }

    @Override
    public List<Tag> getTag() {
        return paperDao.getTag();
    }

    @Override
    public List<Craft> getCraft() {
        return paperDao.getCraft();
    }

    @Override
    public boolean updPaper(int uid, int bsid, int btid, String answer, int bid, int crid, int tid, int id,int userId) {
        int i = paperDao.updPaper(uid, bsid, btid, answer, bid, crid, tid, id,userId);
        if(i>0){
            return true;
       }
        return false;
    }

    @Override
    public boolean addPaper(String pname, int uid, int bsid, int btid, String answer, int bid, int crid, int tid, int mid,int userId) {

        int i = paperDao.addPaper(pname, uid, bsid, btid, answer, bid, crid, tid, mid,userId);
        if(i>0){
           return true;
       }
        return false;
    }


    @Override
    public List<Paper> getPaperBtid(int btid) {
        return paperDao.getPaperBtid(btid);
    }

    @Override
    public boolean delPaper(int id) {
        int i =paperDao.delPaper(id);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public Paper updPaperTo(int id) {
        return paperDao.updPaperTo(id);
    }

    @Override
    public Unit getUnitById(int id) {
        return paperDao.getUnitById(id);
    }

    @Override
    public Tag getTidById(int id) {
        return paperDao.getTidById(id);
    }


}
