package com.acyuta.springsecurityoauth2.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {

    @GetMapping("/")
    public String homeResponse(OAuth2AuthenticationToken token){
        System.out.println(token.getPrincipal());
        return "Redirected after login";
    }
}
