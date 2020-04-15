package cn.qiudev.unittest.service.impl;

import cn.qiudev.unittest.entity.Person;
import cn.qiudev.unittest.mapper.UserMapper;
import cn.qiudev.unittest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiuqiu
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 获取所有用户
     *
     * @return 所有用户信息
     */
    @Override
    public List<Person> getAllPerson() {
        return userMapper.getAllPerson();
    }
}
