package com.ssh.dao.impl;
import com.ssh.dao.UserDao;
import com.ssh.model.UserModel;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * 用户操作dao层接口实现类
 * @author FaceFeel
 * @Created 2018-02-05 20:22
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private HibernateTemplate hibernateTemplate;

    /**
     * 添加用户方法
     * @param userModel 用户实体
     * @return 布尔
     */
    @Override
    public Boolean addUser(UserModel userModel) {

        //返回的是它的记录数
        try {
            Serializable save = hibernateTemplate.save(userModel);
            System.err.println(save);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
