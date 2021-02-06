package com.contactus.contactus.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	
	 @Id
	 private long id;
	 private String name;
	 private String mail;
	 private String budget;
	 private String desc;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(long id, String name, String mail, String budget, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.budget = budget;
		this.desc = desc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", mail=" + mail + ", budget=" + budget + ", desc=" + desc
				+ "]";
	}

	
	 
}
