package com.sp.fc.web.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SnsLoginSecurityConfig extends WebSecurityConfigurerAdapter {

//    OidcUserService
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .oauth2Login()
        ;
    }
}
