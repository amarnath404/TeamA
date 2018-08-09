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
@Table(name="customer")
public class RegistrationDTO implements Serializable
{
	@GenericGenerator(name="myid", strategy="increment")
	@GeneratedValue(generator="myid")
	
	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="username")
	private String  username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mnumber")
	private String mobilenumber;
	
	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Column (name="accnum")
	private long accnum;
	
	public RegistrationDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
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



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public long getAccnum() {
		return accnum;
	}



	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}



	@Override
	public String toString() {
		return "RegistrationDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender
				+ ", username=" + username + ", password=" + password + ", mobilenumber=" + mobilenumber + ", accnum="
				+ accnum + "]";
	}





	
}
