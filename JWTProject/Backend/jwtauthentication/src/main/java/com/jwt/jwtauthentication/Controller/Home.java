package com.jwt.jwtauthentication.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home
{
    @RequestMapping("/welcome")
    public String welcome()
    {
        String text= "this is a private page";
        text+= "this page is not allowed to unauthenticated users";
        return  text;
    }

    @RequestMapping("/getusers")
    public String getusers()
    {
        return "{\"name\": \"Udhaya\"}";
    }
}
