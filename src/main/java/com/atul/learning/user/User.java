/**
 * 
 */
package com.atul.learning.user;

import javax.persistence.Entity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.atul.learning.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
@Entity
public class User extends BaseEntity {

	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	private String firstName;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String userName, String password, String[] roles) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		setPassword(password);
		this.roles = roles;
	}

	private String lastName;
	private String userName;
	@JsonIgnore
	private String password;
	public String[] roles;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = PASSWORD_ENCODER.encode(password);
	}

}
