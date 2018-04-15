package com.dehong.sso.core.dto;

import java.io.Serializable;

/**
 * Created by dehong on 2018-04-06.
 */
public class LoginDto implements Serializable{

    private static final long serialVersionUID = 986081071760043359L;
    private String userName;

    private String password;

    private String type;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
