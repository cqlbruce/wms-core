package com.hht.wms.core.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hht.wms.core.common.Resp;

@Order(-1000)
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Value("${spring.profiles.active:}")
    private String profiles;


    @ExceptionHandler(value = java.lang.RuntimeException.class)
    public Resp commonExceptionHandler(HttpServletRequest request, RuntimeException e) {
        LOG.info(e.getMessage(), e);

        String errorCode = e.getMessage();
        if (StringUtils.isBlank(errorCode)) {
            errorCode = Resp.FAIL_CODE;
        }

        return Resp.fail(errorCode, e.getMessage());
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.OK)
    public Resp illegalArgumentExceptionHandler(HttpServletRequest request, IllegalArgumentException e) {
        LOG.info(e.getMessage(), e);
        return Resp.fail(e.getMessage());
    }
    
    @ExceptionHandler(value = Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseStatus(HttpStatus.OK)
    public Resp exceptionHandler(HttpServletRequest request, Exception e) {
        LOG.info(e.getMessage(), e);
        return Resp.fail( e.getLocalizedMessage());
    }
}
