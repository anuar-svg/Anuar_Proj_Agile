package com.example.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class DemoApplication {

	@Primary
    @Bean(name = "simpleDataSource")
    public DataSource simpleDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:postgresql://192.168.1.90:5432/data_atyrau_2");
        hikariConfig.setUsername("agile3");
        hikariConfig.setPassword("123Qwert");
        hikariConfig.setDriverClassName("org.postgresql.Driver");
        hikariConfig.setMinimumIdle(5);
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setIdleTimeout(30000);
        hikariConfig.setMaximumPoolSize(20);
        hikariConfig.setConnectionTimeout(30000);
        hikariConfig.setMaxLifetime(2000000);
        hikariConfig.setPoolName("SpringBootJPAHikariCP");
        return new HikariDataSource(hikariConfig);
    }
	
	@Bean
    public MapperScannerConfigurer simpleMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.example.demo.repos");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("simpleSqlSessionFactory");
        return mapperScannerConfigurer;
    }
	
	@Bean
    public SqlSessionFactory simpleSqlSessionFactory(@Qualifier("simpleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setFailFast(true);
        return sessionFactory.getObject();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
