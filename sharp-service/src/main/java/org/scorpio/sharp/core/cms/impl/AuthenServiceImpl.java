package org.scorpio.sharp.core.cms.impl;

import org.scorpio.sharp.core.cms.dao.AuthenDao;
import org.scorpio.sharp.core.cms.entity.User;
import org.scorpio.sharp.core.cms.service.AuthenService;
import org.scorpio.spring.boot.dubbo.annotation.DubboProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 
* @ClassName: AuthenServiceImpl  
* @Description: 后台管理平台的登录
* @author Administrator  
* @date 2018年1月3日
 */
@Service
@DubboProvider(interfaceClass = AuthenService.class)
public class AuthenServiceImpl implements AuthenService {
    
    @Autowired
    private AuthenDao authenDao;
    
    
    @Override
    public User find(String userId) {
        return authenDao.find(userId);
    }

}
