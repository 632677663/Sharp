package org.scorpio.sharp.cms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.scorpio.sharp.core.cms.entity.User;
import org.scorpio.sharp.core.cms.service.AuthenService;
import org.scorpio.spring.boot.dubbo.annotation.DubboConsumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* 后台登陆
* @ClassName: AuthenController  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author Administrator  
* @date 2018年1月2日
 */
@Controller
@RequestMapping("/cms/authen")
public class AuthenController {
    
    @DubboConsumer(timeout=6000,check=false) 
    private AuthenService authenService;
    
    private static final Logger logger = LogManager.getLogger(AuthenController.class);
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        logger.info("login in...");
        User find = authenService.find("123");
        System.out.println(find.getDesc());
        return "views/index";
    }
    

}
