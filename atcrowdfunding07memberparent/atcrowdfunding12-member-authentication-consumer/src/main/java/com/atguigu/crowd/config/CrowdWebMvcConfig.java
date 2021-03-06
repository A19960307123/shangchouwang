package com.atguigu.crowd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 宋浩
 * @version 1.0
 * @Classname CrowdWebMvcConfig
 * @Description TODO
 * @Date 2020/7/15 21:40
 */
@Configuration
public class CrowdWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器访问的地址
        String urlPath = "/auth/member/to/reg/page.html";
        //目标视图的名称,将来拼接前后缀
        String viewName = "member-reg";
        //添加view-controller
//        registry.addViewController(urlPath).setViewName(viewName);
        registry.addViewController("/auth/member/to/login/page").setViewName("member-login");
        registry.addViewController("/auth/member/to/reg/page").setViewName("member-reg");
        registry.addViewController("/auth/member/to/center/page").setViewName("member-center");
    }
}
