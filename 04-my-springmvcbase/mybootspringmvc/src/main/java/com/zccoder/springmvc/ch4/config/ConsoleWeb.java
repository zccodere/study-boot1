package com.zccoder.springmvc.ch4.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * 项目启动类
 * Created by ZC on 2017/4/3.
 * @author ZhangCheng
 * @date 2017-04-03
 * @version V1.0
 */
// WebApplicationInitializer是spring提供用来配置Servlet3.0+配置的接口，从而实现了替代web.xml的位置。
// 实现此接口将会自动被SpringServletContainerInitializer（用来启动Servlet3.0容器）获取到。
public class ConsoleWeb implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("==========>ConsoleWeb<==========");
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        //新建WebApplicationContext，注册配置类，并将其和当前servletContext关联。
        context.setServletContext(servletContext);

        //注册SpringMvc的DispatcherServlet。
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        // 服务器端推送技术 Servlet3.0+异步方法处理 开启异步方法支持
        servlet.setAsyncSupported(true);

        // 注册SpringMVC的字符过滤器
        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encoding", new CharacterEncodingFilter());
        EnumSet<DispatcherType> dispatcherTypes = EnumSet.allOf(DispatcherType.class);
        dispatcherTypes.add(DispatcherType.REQUEST);
        dispatcherTypes.add(DispatcherType.FORWARD);
        encodingFilter.addMappingForUrlPatterns(dispatcherTypes, true, "*");
        encodingFilter.setInitParameter("encoding", "UTF-8");

    }
}
