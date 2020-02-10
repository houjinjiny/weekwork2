package com.itdr.service.impl;

import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userDao;
    @Override
    //查询所有
    public List<Users> getAll() {
        List<Users> li=userDao.selectAll();
        return li;
    }

    @Override
    //近三天
    public List<Users> getFast() {
        Calendar now = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //三天前
        now.add(Calendar.DATE, -3);
        String three_days_ago = sdf1.format(now.getTime());
        //二天前
        Calendar now2 = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        now2.add(Calendar.DATE, -2);
        String two_days_ago = sdf2.format(now2.getTime());
        //一天前
        Calendar now3 = Calendar.getInstance();
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        now3.add(Calendar.DATE, -1);
        String one_days_ago = sdf3.format(now3.getTime());
        List<Users> li=userDao.selectFast(three_days_ago,two_days_ago,one_days_ago);
        return li;
    }
    //删除
    @Override
    public int deleteOne(String id) {
        int id2=Integer.parseInt(id);
        System.out.println("s"+id2);
        int i=userDao.deleteOne(id2);
        System.out.println("s"+i);
        return i;
    }

    @Override
    public int addOne(String username, String birthday, String interest, String phonenumber, String qq) {
        int p=Integer.parseInt(phonenumber);
        int q=Integer.parseInt(qq);
        int i=userDao.addOne(username,birthday,interest,p,q);
        return 0;
    }

}
