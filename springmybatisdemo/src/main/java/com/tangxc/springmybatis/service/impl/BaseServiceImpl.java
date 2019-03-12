package com.tangxc.springmybatis.service.impl;

import com.tangxc.springmybatis.dao.BaseDAO;
import com.tangxc.springmybatis.service.BaseService;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:08 2019/3/12
 * @Modified by
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDAO<T> baseDAO;

    public void setBaseDAO(BaseDAO<T> baseDAO) {
        this.baseDAO = baseDAO;
    }

    public void insert(T t) {
        this.baseDAO.insert(t);
    }

    public void update(T t) {
        this.baseDAO.update(t);
    }

    public void delete(Integer id) {
        this.baseDAO.delete(id);
    }

    public T selectOne(Integer id) {
        return this.baseDAO.selectOne(id);
    }

    public List<T> selectAll() {
        return this.baseDAO.selectAll();
    }

}
