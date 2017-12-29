package org.scorpio.shar.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scorpio.sharp.core.Application;
import org.scorpio.sharp.core.cms.entity.User;
import org.scorpio.sharp.core.cms.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
* @ClassName: AuthenServiceTestCase  
* @Description: cms后台管理登陆业务的测试用例 
* @author Administrator  
* @date 2017年12月29日
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AuthenServiceTestCase {
    @Autowired
    private AuthenService authenService;
    
    @Test
    public void authen() {
        User o = authenService.find("123");
        System.out.println(o.getDesc());
        
    }
    

}
