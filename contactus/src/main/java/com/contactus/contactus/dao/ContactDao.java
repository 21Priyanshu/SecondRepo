package com.contactus.contactus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactus.contactus.entities.Contact;

public interface ContactDao extends JpaRepository<Contact, Long> {
	
}
