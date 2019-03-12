package com.tangxc.springmybatis.service;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 14:59 2019/3/12
 * @Modified by
 */
public interface BaseService<T> {

    void insert(T t);

    void update(T t);

    void delete(Integer id);

    T selectOne(Integer id);

    List<T> selectAll();

}
