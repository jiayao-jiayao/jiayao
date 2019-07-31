package com.qf.j1902.service;




import com.qf.j1902.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/6/18.
 */
public interface UserService {
    //定义一个 通过用户名查询用户的方法
    public User getUsersByName(String name);

    //定义一个 添加用户的方法
    boolean addUser(User user);


}
