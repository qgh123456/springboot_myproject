package com.atqgh.springboot.common.advice;

import com.atqgh.springboot.common.result.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

/**
 * @author qiguohui
 * @date 2019-09-03 12:16
 * @Description
 */
@ControllerAdvice
public class CommonException {
    @ExceptionHandler(com.atqgh.springboot.common.exception.CommonException.class)
    public ResponseEntity<ExceptionResult> handleException2(com.atqgh.springboot.common.exception.CommonException ex){
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(333)
                .body(new ExceptionResult(ex.getExceptionEnum()));
        System.out.println(resultResponseEntity);
        return resultResponseEntity;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public String handleException3(MethodArgumentNotValidException ex){
        return "111111111111111";
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public String handleException2(ConstraintViolationException ex){
        return "3333333333333333";
    }

}
