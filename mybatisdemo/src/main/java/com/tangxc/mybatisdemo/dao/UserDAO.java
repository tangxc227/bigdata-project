package com.tangxc.mybatisdemo.dao;

import com.tangxc.mybatisdemo.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 10:44 2019/3/12
 * @Modified by
 */
public class UserDAO {

    /**
     * 插入用户
     *
     * @param user
     */
    public void insert(final User user) {
        DAOTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                sqlSession.insert("users.insert", user);
                return null;
            }
        });
    }

    /**
     * 更新用户
     *
     * @param user
     */
    public void update(final User user) {
        DAOTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                sqlSession.update("users.update", user);
                return null;
            }
        });
    }

    /**
     * 根据ID查询用户
     *
     * @param id
     * @return
     */
    public User selectOne(final Integer id) {
        return (User) DAOTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                return sqlSession.selectOne("users.selectOne", id);
            }
        });
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> selectAll() {
        return (List<User>) DAOTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                return sqlSession.selectList("users.selectAll");
            }
        });
    }

}
