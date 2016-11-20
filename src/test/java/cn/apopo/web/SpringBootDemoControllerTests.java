package cn.apopo.web;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import cn.apopo.properties.HelloProperties;

/**
 * Created by qiaoshuang on 2016/11/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@WebAppConfiguration // 开启Web上下文测试
public class SpringBootDemoControllerTests {

    @Autowired
    private WebApplicationContext webApplicationContext; // 注入WebApplicationContext

    private MockMvc mockMvc;

    @InjectMocks
    private SpringBootDemoController springBootDemoController = new SpringBootDemoController();

    @Mock
    private HelloProperties helloProperties;

    @Before
    public void setupMockMvc() { // 设置MockMvc
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testHelloWorld() {
        String result = springBootDemoController.helloWorld();
        assertEquals("HelloWorld", result);
    }

    @Test
    public void testHome() throws Exception {
        String result = mockMvc.perform(MockMvcRequestBuilders.get("/home"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        assertEquals("HelloWorld", result);
    }

}
