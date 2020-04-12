package cn.qiudev.unittest.controller;

import cn.qiudev.unittest.UnitTestApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = UnitTestApplication.class)
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
}