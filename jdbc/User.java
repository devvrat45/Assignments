package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	
	protected int id;
	protected String name;
	protected String username;
	protected String password;
	protected String email;
	protected int r;
	protected Role roles;
	protected String phone;
	public User(int id, String name, String username, String password, String email,int r, Role roles, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.r=r;
		this.roles = roles;
		this.phone = phone;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRoles() {
		return roles;
	}
	public void setRoles(Role roles) {
		this.roles = roles;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + ChangePass(password) + ", email="
				+ email + ", r=" + r + ", roles=" + roles.getName() + ", phone=" + phone + "]";
	}
	
	public String ChangePass(String pass) {
		String pass1 = "*";
		
	for(int i=1; i<pass.length();i++) {
	 pass1=pass1+"*";
	
	}
	
		
		return pass1;
		
				
	}


		

}

