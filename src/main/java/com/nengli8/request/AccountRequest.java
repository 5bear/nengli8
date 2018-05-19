package com.nengli8.request;

/**
 * Created by 11369 on 2018/5/19.
 */
public class AccountRequest extends BaseRequest {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
