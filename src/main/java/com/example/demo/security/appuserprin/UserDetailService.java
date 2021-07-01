package com.example.demo.security.appuserprin;

import com.example.demo.model.AppUser;
import com.example.demo.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailService implements UserDetailsService {
    @Autowired
    IAppUserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userService.findAppUserByName(username).
                orElseThrow(()->new UsernameNotFoundException("User not found -> username or password"+username));
        return UserDetailIplm.build(user);
    }
}
