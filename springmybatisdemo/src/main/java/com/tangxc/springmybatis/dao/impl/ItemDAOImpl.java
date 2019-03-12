package com.tangxc.springmybatis.dao.impl;

import com.tangxc.springmybatis.dao.BaseDAO;
import com.tangxc.springmybatis.domain.Item;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 16:53 2019/3/12
 * @Modified by
 */
@Repository("itemDAO")
public class ItemDAOImpl extends SqlSessionDaoSupport implements BaseDAO<Item> {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void insert(Item item) {
        this.getSqlSession().insert("items.insert", item);
    }

    public void update(Item item) {

    }

    public void delete(Integer id) {

    }

    public Item selectOne(Integer id) {
        return null;
    }

    public List<Item> selectAll() {
        return null;
    }
}
