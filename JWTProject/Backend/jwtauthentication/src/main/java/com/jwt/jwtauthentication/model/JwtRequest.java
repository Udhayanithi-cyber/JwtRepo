package com.jwt.jwtauthentication.model;

import com.jwt.jwtauthentication.entity.detailsEntity.logindetails;
import org.springframework.beans.factory.annotation.Autowired;

public class JwtRequest
{
    @Autowired
    private com.jwt.jwtauthentication.entity.detailsEntity.logindetails logindetails;
    String username;
    String password;

    public JwtRequest(){}

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "JwtRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
