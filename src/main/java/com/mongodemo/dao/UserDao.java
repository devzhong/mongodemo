package com.mongodemo.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodemo.entity.UserMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:devzhong
 * Date:2019/5/13 17:34
 */
@Repository
public class UserDao {
    private static final String SAVE_USER = "save_user";

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(UserMongo userMongo){
        Query query = new Query();
        query.addCriteria(Criteria.where("uuid").is(userMongo.getUuid()));
        DBObject dbDoc = new BasicDBObject();
        mongoTemplate.getConverter().write(userMongo, dbDoc);
        mongoTemplate.upsert(query, Update.fromDBObject(dbDoc),UserMongo.class,SAVE_USER);

    }
}
