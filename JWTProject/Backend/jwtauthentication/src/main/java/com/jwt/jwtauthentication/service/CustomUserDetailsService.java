package com.jwt.jwtauthentication.service;


import com.jwt.jwtauthentication.entity.detailsEntity.logindetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService
{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("Udhaya"))
        {
            return new User("Udhaya","Udhaya123", new ArrayList<>());
        } else if (username.equals("Shalani"))
        {
          return new User("Shalani","Shalani",new ArrayList<>());
        }
        else
        {
            throw new UsernameNotFoundException("User not Found");
        }


    }
}
