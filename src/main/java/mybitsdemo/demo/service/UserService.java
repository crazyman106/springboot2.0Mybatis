package mybitsdemo.demo.service;

import com.github.pagehelper.PageInfo;
import mybitsdemo.demo.model.UserDomain;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
