package com.ssh.service;

import com.ssh.model.UserModel;

/**
 * 用户操作service层接口
 * @author FaceFeel
 * @Created 2018-02-04 23:01
 */
public interface UserService {

    /**
     * 添加用户方法
     * @param userModel 用户实体
     * @return 布尔
     */
    Boolean addUser(UserModel userModel);
}
