package com.torv.adam.service;

import com.torv.adam.bean.User;

/**
 * Created by AdamLi on 2016/10/18.
 */
public interface IUserService {
    public User findUserById(int id);

    public void addUser(User user);
}
