package cn.beyond.beyond.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author Wulf
 * @Date 2020年5月20日
 * @Version 1.0
 * @Description TODO pageDto
 */
@Data
public class PageDto implements Serializable{

	private int pageIndex = 1;
	private int pageSize = 10;
	
	
}
