package com.butterfly.sqlSession;

/**
 * Created by adminnistrator on 2019/1/21.
 */
public interface Excutor {

        public <T> T query(String statement, Object parameter);

    }

