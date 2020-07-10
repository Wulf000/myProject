package cn.beyond.beyond.entity.auth;

import java.util.Set;

import lombok.Data;

@Data
public class User {

    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
    //省略set、get方法等.....
	public User(String id, String userName, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
