package com.torv.adam.service;

import com.torv.adam.bean.User;
import com.torv.adam.dao.IUserDao;
import com.torv.adam.dao.UserDaoImpl;

/**
 * Created by AdamLi on 2016/10/18.
 */
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
