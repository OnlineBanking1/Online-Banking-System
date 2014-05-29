package com.banking.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Customers_1")
public class Customer {

	@Id
@GeneratedValue
private int customer_id;



@Column
@NotEmpty(message="Cannot be blank")
private String first_name;

@Column
@NotEmpty
private String last_name;

@Column
@NotEmpty
private String address1;

@Column
private String address2;

@Column
@NotEmpty
private String city;

@Column
@NotEmpty 
private String state;

@Column(nullable=false, length=5)

private int zipCode;

@Column
@NotEmpty
@Size(min=10,max=10)
private String Mobile;

@Column
private Date reg_date;

@Email
@Column
@NotEmpty
private String email;

@Column
@NotEmpty
private String user_name;

@Column
@NotEmpty
@Size(min=4,max=10)
private String password;

@NotEmpty
private String confirm_password;

public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipCode() {
	return zipCode;
}
public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}
public String getMobile() {
	return Mobile;
}
public void setMobile(String mobile) {
	Mobile = mobile;
}
public Date getReg_date() {
	return reg_date;
}
public void setReg_date(Date reg_date) {
	this.reg_date = reg_date;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirm_password() {
	return confirm_password;
}
public void setConfirm_password(String confirm_password) {
	this.confirm_password = confirm_password;
}



}
