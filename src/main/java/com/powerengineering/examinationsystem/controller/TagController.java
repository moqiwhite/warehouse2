package com.powerengineering.examinationsystem.controller;

import com.powerengineering.examinationsystem.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.powerengineering.examinationsystem.model.entity.Tag;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class TagController {

@Resource
    private TagService tagService;

@RequestMapping("/tag")
    public String tag(HttpServletRequest request){
    List<Tag> tagList = tagService.getAllTag();
    request.setAttribute("tagList",tagList);
    return "tag";
}

@RequestMapping("/updTag")
    public String updTag(int id,HttpServletRequest request){
   Tag tag = tagService.getTagid(id);
   request.setAttribute("tag",tag);
    return "tagUpd";
}

@RequestMapping(value = "/doUpdTag",method = RequestMethod.POST)
    public String doUpdTag(int id ,String tname,HttpServletRequest request,HttpServletResponse redirect) {

    boolean i = tagService.updTag(id, tname);
    if(i) {
        return "redirect:tag";
    }
    return "tagUpd";
}

@RequestMapping(value = "/doAddTag",method = RequestMethod.POST)
    public String doAddTag(String tname,HttpServletRequest request){
    boolean b = tagService.addTag(tname);
    if (b){
        request.setAttribute("info","添加成功");
    }else{
        request.setAttribute("info","添加失败");
    }
    List<Tag> tagList = tagService.getAllTag();
    request.setAttribute("tagList",tagList);
        return "tag";
}
    @RequestMapping("/delTag")
    @ResponseBody
    public String delTag(int id,HttpServletRequest request,HttpServletResponse redirect){
        boolean b = tagService.delTagByid(id);
        if (b){
            return "success";
        }else{
            return "failed";
        }
    }
}
