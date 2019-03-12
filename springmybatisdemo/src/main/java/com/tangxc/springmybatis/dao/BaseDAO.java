package com.tangxc.springmybatis.dao;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 14:49 2019/3/12
 * @Modified by
 */
public interface BaseDAO<T> {

    /**
     * 添加对象
     *
     * @param t
     */
    void insert(T t);

    void update(T t);

    void delete(Integer id);

    T selectOne(Integer id);

    List<T> selectAll();

}
