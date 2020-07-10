package cn.beyond.beyond.dto.req;

import cn.beyond.beyond.dto.PageDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UlcheckTaskReqDto extends PageDto{
	
	private String id;
}
