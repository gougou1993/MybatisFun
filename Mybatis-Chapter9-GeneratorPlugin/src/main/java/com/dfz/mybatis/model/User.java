package com.dfz.mybatis.model;

import com.dfz.base.BaseModel;

@SuppressWarnings("serial")
public class User extends BaseModel {
    private String password;

    private String address;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}