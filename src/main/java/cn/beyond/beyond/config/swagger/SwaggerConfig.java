package cn.beyond.beyond.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @Author Wulf
 * @Date 2020年6月30日
 * @Version 1.0
 * @Description TODO swaggerAPI
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	/**
	 * @Date 2020-05-17
	 * @Author Wulf  
	 * @return Docket
	 * @Description TODO()swagger容器
	 */
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //指定包路径,构建api
                .apis(RequestHandlerSelectors.basePackage("cn.beyond.beyond.controller"))
                .paths(PathSelectors.any())
                .build();
    
	}
	
    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("SpringBoot使用 Swagger2构建RESTful API")
                //创建人
                .contact(new Contact("wulf", "http://blog.bianxh.top/", ""))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}