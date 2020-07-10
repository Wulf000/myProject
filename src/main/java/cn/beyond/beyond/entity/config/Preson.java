package cn.beyond.beyond.entity.config;

import java.io.Serializable;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO 注入配置文件属性对象
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Preson implements Serializable{

	private String name;
	
	private String des;
	
	private List<String> like;
	
	private Student student;

	public String getName() {
		return name;
	}
	
}
