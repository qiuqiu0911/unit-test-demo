package cn.qiudev.unittest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 用户信息
 *
 * @author qiuqiu
 */
@Getter
@Setter
public class Person {

    private String id;

    private String name;

    private String idCard;

    private String createUser;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
}
