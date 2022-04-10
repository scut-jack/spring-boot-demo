package com.xkcoding.template.freemarker.controller;

import cn.hutool.core.util.ObjectUtil;
import com.xkcoding.template.freemarker.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 主页
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-19 15:07
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping(value = {"", "/"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        /* 接口HttpServletRequest继承自ServletRequest
         * 客户端浏览器发出的请求，会被封装成为一个HttpServletRequest对象。
         * 请求的所有的信息，包括请求的地址、请求的参数、提交的数据、上传的文件、客户端的ip，甚至客户端操作系统都包含在其内。
         * servlet容器会创建一个HttpServletRequest对象，并将其转换为servlet的service、doGet、 doPost等方法的参数。
         * */
        User user = (User) request.getSession().getAttribute("user");
        if (ObjectUtil.isNull(user)) {
            mv.setViewName("redirect:/user/login");
        } else {
            mv.setViewName("page/index");
            mv.addObject(user);
        }

        return mv;
    }
}
