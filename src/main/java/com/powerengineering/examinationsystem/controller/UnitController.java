package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.model.entity.Unit;
import com.powerengineering.examinationsystem.service.UnitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UnitController {

    @Resource
    private UnitService unitService;

    @RequestMapping("/tounit")
    public String tounit(HttpServletRequest request){
        List<Unit> unitList = unitService.getAllUnit();
        request.setAttribute("unitList",unitList);
        return "userUnit";

    }

    @RequestMapping(value = "/doAddUnit",method = RequestMethod.POST)
    public String doAddUnit(String Uname,HttpServletRequest request){
        boolean b = unitService.addUnit(Uname);
        if (b){
            request.setAttribute("info","添加成功");
        }else {
            request.setAttribute("info","添加失败");
        }
        List<Unit> unitList = unitService.getAllUnit();
        request.setAttribute("unitList",unitList);
        return "userUnit";
    }

    @RequestMapping("/updUnit")
    public String updUnit(int id,HttpServletRequest request){
        Unit unit = unitService.getUniTid(id);
        request.setAttribute("unit",unit);
        return "updUserUnit";
    }

    @RequestMapping(value = "/doupdUnit",method = RequestMethod.POST)
    public String doupdUnit(int id, String Uname){
        boolean i = unitService.updUnit(id,Uname);
        if (i){
            return "/tounit";
        }
        return "updUserUnit";
    }

    @RequestMapping("/delUnit")
    @ResponseBody
    public String delUnit(int id,HttpServletRequest request){
        boolean i = unitService.delUnit(id);
        if (i){
            return "success";
        }else {
            return "failed";
        }
    }
}
