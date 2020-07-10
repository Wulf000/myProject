package cn.beyond.beyond.config.page;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author Wulf
 * @Date 2020年7月1日
 * @Version 1.0
 * @Description TODO 分页pageSize设置
 */
@Configuration
public class PageConfig extends WebMvcConfigurerAdapter{

	private static final int PMP_MAX_PAGE_SIZE = 500000;
	
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
		
		resolver.setMaxPageSize(PMP_MAX_PAGE_SIZE);
		argumentResolvers.add(resolver);
		super.addArgumentResolvers(argumentResolvers);
	}
}
