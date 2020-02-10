package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/getall.do")
    public ModelAndView getAll(){
        ModelAndView m=new ModelAndView();
        List<Users> li=userService.getAll();
        m.addObject("li",li);
        m.setViewName("home");
        return m;
    }
    @RequestMapping("/user/fastbirth.do")
    public ModelAndView getFast(){
        ModelAndView m=new ModelAndView();
        List<Users> li=userService.getFast();
        m.addObject("li",li);
        m.setViewName("home");
        return m;
    }
    @RequestMapping("/user/deleteOne.do")
    public ModelAndView deleteOne(String id){
        ModelAndView m=new ModelAndView();
        int i=userService.deleteOne(id);
        if(i>0){
            List<Users> li=userService.getAll();
            m.addObject("li",li);
            m.setViewName("home");
            return m;
        }
        return m;
    }
    @RequestMapping("/user/addOne.do")
    public ModelAndView addOne(String username,String birthday,String interest,String phonenumber,String qq){
        ModelAndView m=new ModelAndView();
        int i=userService.addOne(username,birthday,interest,phonenumber,qq);
//        if(i>0){
////            List<Users> li=userService.getAll();
////            m.addObject("li",li);
////            m.setViewName("home");
////            return m;
////        }
        List<Users> li=userService.getAll();
        m.addObject("li",li);
        m.setViewName("home");
        return m;
    }
    @RequestMapping("/user/tiao.do")
    public ModelAndView tiaoOne(){
        ModelAndView m=new ModelAndView();
        m.setViewName("add");
        return m;
    }
}
