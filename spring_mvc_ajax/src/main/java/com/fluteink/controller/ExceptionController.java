package com.fluteink.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 明宇
 * @version 1.0
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
