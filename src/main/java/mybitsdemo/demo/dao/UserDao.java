package mybitsdemo.demo.dao;

import mybitsdemo.demo.model.UserDomain;

import java.util.List;

public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}