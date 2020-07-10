package cn.beyond.beyond.enums;

public enum DateIN {

	ONEDAY("1","1"),
	FIVETITY("2","15");
	private String key;
	private String value;
	
	DateIN(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue(){
		return value;
	}

}
