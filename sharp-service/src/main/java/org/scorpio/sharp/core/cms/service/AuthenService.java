package org.scorpio.sharp.core.cms.service;

import org.scorpio.sharp.core.cms.entity.User;

/**
 * 
* @ClassName: AuthenService  
* @Description: 客户认证接口
* @author Administrator  
* @date 2017年12月27日
 */
public interface AuthenService {
    
    public User find(String userId);
    
}
