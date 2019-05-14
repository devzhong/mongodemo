package com.mongodemo.service;

import com.mongodemo.dao.UserDao;
import com.mongodemo.entity.UserMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author:devzhong
 * Date:2019/5/13 17:35
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(UserMongo userMongo){
        try{
            userDao.insert(userMongo);
        }catch (Exception e){
            System.out.println("exception e:"+e);
        }
    }
}
