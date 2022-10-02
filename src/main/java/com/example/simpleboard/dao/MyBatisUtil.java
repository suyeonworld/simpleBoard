package com.example.simpleboard.dao;

import lombok.Getter;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
@Getter
public enum MyBatisUtil {
    INSTANCE;

    //DataSource를 참조하여 MyBatis와 Mysql 서버를 연동시켜준다.
    //데이터베이스와의 연결과 SQL의 실행에 대한 모든 것을 가진 가장 중요한 객체
    private SqlSessionFactory sqlSessionFactory;

    MyBatisUtil(){
        //mybtis-config파일 (db연동)을 읽어 Inputstream에 넣는다.
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            //getter/setter를 하지 않아도 비슷하게 사용할 수 있는 sql생성 공장
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}

