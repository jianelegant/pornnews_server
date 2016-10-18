package com.torv.adam.dao;

import com.torv.adam.bean.User;

/**
 * Created by AdamLi on 2016/10/18.
 */
public interface IUserDao {
    public User findUserById(int id); //查询

    public void addUser(User user); //添加
}