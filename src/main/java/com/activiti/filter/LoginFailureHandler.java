package com.activiti.filter;

import com.activiti.exception.VerifyCodeException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginFailureHandler {
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, VerifyCodeException e) {

    }
}
