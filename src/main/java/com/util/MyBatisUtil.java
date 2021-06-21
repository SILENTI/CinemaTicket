package com.util;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    /**
     * 获取SqlSession方法
     * 以 mybatis-config.xml 为配置文件
     * */
    private static SqlSessionFactory factory;


    static {
        //工人
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //读取配置文件
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("classpath:mybatis-config.xml");
        //创建工厂
        factory = builder.build(input);
    }

    //手动提交
    public static SqlSession getSqlSession(){
        return factory.openSession() ;
    }

    //自动提交
    public static SqlSession getSqlSession(Boolean b){
        return factory.openSession(b) ;
    }

    public static <T>T getMapper (Class clazz){
        return (T)factory.openSession().getMapper(clazz);
    }

    public static <T>T getMapper (Class clazz,Boolean judge){
        return (T) factory.openSession(judge).getMapper(clazz);
    }

}
