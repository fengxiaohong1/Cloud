package com.activiti.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author fxh
 */
public class VerifyCodeException extends AuthenticationException {
    public VerifyCodeException(String msg) {
        super(msg);
    }
}