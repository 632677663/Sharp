package org.scorpio.sharp.core.cms.entity;

import java.io.Serializable;

/**
* 
* @ClassName: User  
* @Description: 后台管理平台用户实体对象
* @author Administrator  
* @date 2017年12月27日
*/
public class User implements Serializable{

    private static final long serialVersionUID = -6199935374396973765L;
    
    private String userId;
    
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    

}
