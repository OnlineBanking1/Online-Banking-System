package com.banking.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
@Id
@GeneratedValue
private int account_id;
@Column
private String account_type;
@Column
private String account_description;
public int getAccount_id() {
	return account_id;
}
public void setAccount_id(int account_id) {
	this.account_id = account_id;
}
public String getAccount_type() {
	return account_type;
}
public void setAccount_type(String account_type) {
	this.account_type = account_type;
}
public String getAccount_description() {
	return account_description;
}
public void setAccount_description(String account_description) {
	this.account_description = account_description;
}

}
