package cn.beyond.beyond;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@EnableScheduling
//请根据实际项目修改
@MapperScan(value = "cn.beyond.beyond.entity.mapper")
@ComponentScan(basePackages={"cn.beyond.beyond.*"})
@EnableTransactionManagement
@EnableRabbit
public class StartApplication {

	public static void main(final String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
