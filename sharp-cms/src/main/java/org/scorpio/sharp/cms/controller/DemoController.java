package org.scorpio.sharp.cms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
* @ClassName: DemoController  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author Administrator  
* @date 2017年12月27日
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    
    private static final Logger logger = LogManager.getLogger(DemoController.class);
    
    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String demo() {
        logger.info("12333664");
        return "1255";
        
    }
    
    
}
