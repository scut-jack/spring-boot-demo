package com.xkcoding.exception.handler.controller;

import com.xkcoding.exception.handler.constant.Status;
import com.xkcoding.exception.handler.exception.JsonException;
import com.xkcoding.exception.handler.exception.PageException;
import com.xkcoding.exception.handler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试Controller
 * Controller方法中抛出的Exception可以被@ControllerAdvice注解的类中@ExceptionHandler注解的方法捕获到
 * 这是Springmvc @ControllerAdvice注解提供的全局异常处理功能
 *
 * @author yangkai.shen
 * @date Created in 2018-10-02 20:49
 */
@Controller
public class TestController {

    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
