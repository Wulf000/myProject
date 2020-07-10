package cn.beyond.beyond.entity.auth;

import lombok.Data;

@Data
public class Permissions {

	private String id;
    private String permissionsName;
    


	public Permissions(String id, String permissionsName) {
		super();
		this.id = id;
		this.permissionsName = permissionsName;
	}
    
    
}
