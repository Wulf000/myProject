package cn.beyond.beyond.entity.globalResponce;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;


public class ResultInfo implements Serializable {

	
	 private ResultInfo(String code, String message, Object data)
	    {
	        this.code = code;
	        this.message = message;
	        this.data = data;
	    }

	    public ResultInfo()
	    {
	        code = "200";
	        message = "\u6210\u529F";
	    }

	    public static ResultInfo buildSuccess()
	    {
	        return buildSuccess("\u6210\u529F");
	    }

	    public static ResultInfo buildSuccess(String message)
	    {
	        return buildSuccess(null, message);
	    }

	    public static ResultInfo buildSuccess(Object data)
	    {
	        return buildSuccess(data, "\u6210\u529F");
	    }

	    public static ResultInfo buildSuccess(Object data, String message)
	    {
	        return new ResultInfo("200", message, data);
	    }

	    public static ResultInfo buildFailure()
	    {
	        return buildFailure("\u5931\u8D25");
	    }

	    public static ResultInfo buildFailure(String message)
	    {
	        return new ResultInfo("500", message, null);
	    }

	    public static ResultInfo buildFailure(String code, String message)
	    {
	        return new ResultInfo(code, message, null);
	    }

	    public static ResultInfo buildFailure(Object data, String message)
	    {
	        return new ResultInfo("500", message, data);
	    }

	    public ResultInfo message(String message)
	    {
	        this.message = message;
	        return this;
	    }

	    public ResultInfo data(Object data)
	    {
	        this.data = data;
	        return this;
	    }

	    public String getCode()
	    {
	        return code;
	    }

	    public String getMessage()
	    {
	        return message;
	    }

	    public Object getData()
	    {
	        return data;
	    }

	    public String toString()
	    {
	        return JSONObject.toJSONString(this);
	    }

	    private static final long serialVersionUID = 2858244548725271096L;
	    private static final String SUCCESS_CODE = "200";
	    private static final String FAIL_CODE = "500";
	    private static final String SUCCESS_MESSAGE = "\u6210\u529F";
	    private static final String FAIL_MESSAGE = "\u5931\u8D25";
	    private String code;
	    private Object data;
	    private String message;
	/*private static final long serialVersionUID = 2858244548725271096L;
	private static final String SUCCESS_CODE = "200";
	private static final String FAIL_CODE = "500";
	private static final String SUCCESS_MESSAGE = "\u6210\u529F";
	private static final String FAIL_MESSAGE = "\u5931\u8D25";
	private String code;
	private Object data;
	private String message;

	private ResultInfo(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	//成功默认
	public static ResultInfo buildSuccess(Objects data) {
		return new ResultInfo(SUCCESS_CODE, SUCCESS_MESSAGE, data);
	}
	//成功
	public static ResultInfo buildSuccess(Object data, String message) {
		return new ResultInfo(SUCCESS_CODE, message, data);
	}
	//失败
	public static ResultInfo buildFailure(String message) {
		return new ResultInfo(FAIL_CODE, message, null);
	}
	//警告提醒(自定义201)
	public static ResultInfo buildCaveat(String code, String message) {
		return new ResultInfo(code, message, null);
	}
	
	public ResultInfo message(String message) {
		this.message = message;
		return this;
	}

	public ResultInfo data(Object data) {
		this.data = data;
		return this;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}*/

}
