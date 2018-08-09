package org.techgene.mvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="logindata")
public class LoginDTO implements Serializable 
{
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mobilenumber")
	String mobilenumber;
		
	public LoginDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}


	public LoginDTO(int id, String username, String password,String mobilenumber)
	{
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobilenumber=mobilenumber;
	}

	

	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", username=" + username + ", password=" + password + ", mobilenumber="
				+ mobilenumber + "]";
	}


	

	
}
