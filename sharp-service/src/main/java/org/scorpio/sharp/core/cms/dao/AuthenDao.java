package org.scorpio.sharp.core.cms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.scorpio.sharp.core.cms.entity.User;
@Mapper
public interface AuthenDao {
    @Select("select * from tb_u where user_id = #{userId}")
    public User find(String userId);
}
