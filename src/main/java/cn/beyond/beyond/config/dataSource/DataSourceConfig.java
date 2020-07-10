package cn.beyond.beyond.config.dataSource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import lombok.extern.slf4j.Slf4j;
/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO 多数据源配置
 * 自动装配时当出现多个Bean候选者时，被注解为@Primary的Bean将作为首选者，否则将抛出异常
 */
@Configuration
@Slf4j
public class DataSourceConfig {
	
	/**
     * 当多个数据源共存时，需要制定一个Primary
     * @return
     */
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties primaryDataSourceProperties(){
        return new DataSourceProperties();
    }
    
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource primaryDatasource() {
        return primaryDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "secondDatasource")
    @ConfigurationProperties(prefix = "spring.second-datasource")
    public DataSource secondDatasource() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean(name = "secondNamedParameterJdbcTemplate")
    public NamedParameterJdbcTemplate secondNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(secondDatasource());
    }
   
}
