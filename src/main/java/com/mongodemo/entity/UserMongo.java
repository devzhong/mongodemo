package com.mongodemo.entity;

/**
 * desc:
 * author:devzhong
 * Date:2019/5/13 18:16
 */
public class UserMongo {

    private String uuid;
    private String username;
    private String password;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
