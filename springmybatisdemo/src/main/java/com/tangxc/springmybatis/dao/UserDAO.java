package com.tangxc.springmybatis.dao;

import com.tangxc.springmybatis.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 14:48 2019/3/12
 * @Modified by
 */
@Repository
public class UserDAO extends SqlSessionDaoSupport implements BaseDAO<User> {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void insert(User user) {
        this.getSqlSession().insert("users.insert", user);
    }

    public void update(User user) {
        this.getSqlSession().update("users.insert", user);
    }

    public void delete(Integer id) {
        this.getSqlSession().delete("users.delete", id);
    }

    public User selectOne(Integer id) {
        return this.getSqlSession().selectOne("users.selectOne", id);
    }

    public List<User> selectAll() {
        return this.getSqlSession().selectList("users.selectAll");
    }

}
