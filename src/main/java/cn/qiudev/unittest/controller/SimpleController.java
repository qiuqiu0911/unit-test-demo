package cn.qiudev.unittest.controller;

import cn.qiudev.unittest.entity.Person;
import cn.qiudev.unittest.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 简单controller,
 * 用于测试
 *
 * @author qiuqiu
 */
@RestController
@RequestMapping("/simple")
public class SimpleController {

    private final UserService userService;

    public SimpleController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/date")
    public String testDate() {
        return new Date().toString();
    }

    @GetMapping("/allPerson")
    public List<Person> getAllPerson() {
        return userService.getAllPerson();
    }
}
