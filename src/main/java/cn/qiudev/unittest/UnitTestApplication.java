package cn.qiudev.unittest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author qiuqiu
 */
@MapperScan("cn.qiudev.unittest.mapper")
@SpringBootApplication
public class UnitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestApplication.class, args);
    }

}
