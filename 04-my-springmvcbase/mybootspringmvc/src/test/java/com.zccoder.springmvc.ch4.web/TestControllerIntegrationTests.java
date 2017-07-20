package com.zccoder.springmvc.ch4.web;

import com.zccoder.springmvc.ch4.config.SpringMvcConfig;
import com.zccoder.springmvc.ch4.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * 测试用例
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    WebApplicationContext wac;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormalController() throws Exception{
        RequestBuilder requestBuilder = new RequestBuilder() {
            @Override
            public MockHttpServletRequest buildRequest(ServletContext servletContext) {
                MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
                mockHttpServletRequest.setRequestURI("/normal");
                return mockHttpServletRequest;
            }
        };
        mockMvc.perform(requestBuilder);
//                .andExpect(status().isOk())
//                .andExpect(view().name("page"))
//                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
//                .andExpect(model().attribute("msg",demoService.saySomething("name")));
    }

    public void testRestController() throws Exception{
        RequestBuilder requestBuilder = new RequestBuilder() {
            @Override
            public MockHttpServletRequest buildRequest(ServletContext servletContext) {
                MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
                mockHttpServletRequest.setRequestURI("/testRest");
                return mockHttpServletRequest;
            }
        };
        mockMvc.perform(requestBuilder);
    }

}
