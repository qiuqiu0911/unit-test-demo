package cn.qiudev.unittest.mapper;

import cn.qiudev.unittest.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * mapper
 *
 * @author qiuqiu
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有用户
     *
     * @return 所有用户信息
     */
    @Select("select * from person")
    List<Person> getAllPerson();
}
