package com.xkcoding.helloworld;

import org.springframework.web.bind.annotation.*;

/**
 * @author Tiieeiiwang
 * @description:
 * @date 2021/11/11
 */
@RestController
@RequestMapping(path = "prefix", method = RequestMethod.GET)
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "input") String input) {
        return "hello " + input;
    }
}
