package com.zccoder.mybootch913.web;

import com.zccoder.mybootch913.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title 主页控制器类
 * @describe 为首页显示准备数据
 * @author zc
 * @version 1.0 2017-09-22
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg = new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
        return "home";
    }

}
