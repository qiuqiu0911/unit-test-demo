package cn.qiudev.unittest.service;

import cn.qiudev.unittest.entity.Person;

import java.util.List;

/**
 * 接口定义
 * @author qiuqiu
 */
public interface UserService {

    /**
     * 获取所有用户
     *
     * @return 所有用户信息
     */
    List<Person> getAllPerson();
}
