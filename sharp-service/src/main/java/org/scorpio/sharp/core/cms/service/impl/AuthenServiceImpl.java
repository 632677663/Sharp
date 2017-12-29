package org.scorpio.sharp.core.cms.service.impl;

import org.scorpio.sharp.core.cms.dao.AuthenDao;
import org.scorpio.sharp.core.cms.entity.User;
import org.scorpio.sharp.core.cms.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AuthenServiceImpl implements AuthenService {
    
    @Autowired
    private AuthenDao authenDao;
    
    
    @Override
    public User find(String userId) {
        return authenDao.find(userId);
    }

}
