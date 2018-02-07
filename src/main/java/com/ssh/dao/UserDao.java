package com.ssh.dao;

import com.ssh.model.UserModel;

/**
 * 用户操作dao层接口
 * @author FaceFeel
 * @Created 2018-02-05 20:22
 */

public interface UserDao {

    /**
     * 添加用户方法
     * @param userModel 用户实体
     * @return 布尔
     */
    Boolean addUser(UserModel userModel);
}
