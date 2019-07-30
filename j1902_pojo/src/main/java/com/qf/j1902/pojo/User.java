package com.qf.j1902.pojo;

import lombok.Data;

/**
 * Created by Administrator on 2019/6/13.
 */
@Data
public class User {
    private  int id;
    private  String loginName;
    private String loginPwd;
    private String trueName;
    private String phone;
    private String address;
    private int status;
    private String head;
    public User() {
    }

    public User(int id, String loginName, String loginPwd, String trueName, String phone, String address, int status, String head) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.trueName = trueName;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.head = head;
    }
}
