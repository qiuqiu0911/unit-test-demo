package cn.qiudev.unittest.controller;

import cn.qiudev.unittest.UnitTestApplication;
import cn.qiudev.unittest.entity.Person;
import com.alibaba.fastjson.JSONArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = UnitTestApplication.class)
@Transactional
class SimpleControllerTest {


    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeEach
    public void setupMockMvc() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    void testDate() throws Exception {
        ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.get("/simple/date"));
        perform.andExpect(MockMvcResultMatchers.status().isOk());
        System.out.println(perform.andReturn().getResponse().getContentAsString());
    }

    @DisplayName("获取所有用户")
    @Test
    @Sql("classpath:sql/insertUser.sql")
    void testUserList() throws Exception {
        ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.get("/simple/allPerson"));
        perform.andExpect(MockMvcResultMatchers.status().isOk());
        String responseString = perform.andReturn().getResponse().getContentAsString();
        System.out.println(responseString);
        List<Person> people = JSONArray.parseArray(responseString, Person.class);
        assertEquals(2, people.size());
    }
}