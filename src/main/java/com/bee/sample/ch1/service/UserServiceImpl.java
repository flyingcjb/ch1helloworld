package com.bee.sample.ch1.service;

import com.bee.sample.ch1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public User getUserById(String userId) {
        int rowCount = this.jdbcTemplate.queryForObject("select count(1) from TB_VHT300_130_C",Integer.class);
        User rtnUsr = new User();
        rtnUsr.setId(""+rowCount);
        rtnUsr.setName("池");
        return rtnUsr;
    }
}
