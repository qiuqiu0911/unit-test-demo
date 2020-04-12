package cn.qiudev.unittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 简单controller,
 * 用于测试
 *
 * @author qiuqiu
 */
@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/date")
    public String testDate() {
        return new Date().toString();
    }
}
