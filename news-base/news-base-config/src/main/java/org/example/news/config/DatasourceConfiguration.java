package org.example.news.config;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 数据源配置注解
 */
@Configuration
//注解说明启用事务管理
@EnableTransactionManagement
@EnableJpaRepositories("org.example.news")
public class DatasourceConfiguration {

    /**
     * 使用阿里的数据源
     * 这里数据源配置非常重要，如果数据源配置错了，会出现一个莫名奇妙的错误， 而且看不出来是数据源错了,只会提示hibernate的EntityManager初始化错误！
     *
     * @return
     */
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
