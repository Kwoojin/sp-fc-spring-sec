package com.sp.fc.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "홈페이지";
    }

    /**
     * 인증 정보 테스트
     */
    @RequestMapping("/auth")
    public Authentication auth() {
        return SecurityContextHolder.getContext()
                .getAuthentication();
    }

    /**
     * 개인 정보 테스트
     */
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping("/user")
    public SecurityMessage user(@AuthenticationPrincipal UserDetails user) {
        return SecurityMessage.builder()
                .user(user)
                .message("유저 정보")
                .build();
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/admin")
    public SecurityMessage admin(@AuthenticationPrincipal UserDetails user) {
        return SecurityMessage.builder()
                .user(user)
                .message("관리자 정보")
                .build();
    }

}
