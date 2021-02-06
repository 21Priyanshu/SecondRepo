package com.contactus.contactus.services;

import java.util.List;

import com.contactus.contactus.entities.Contact;

public interface ContactServices {
	public List<Contact> getContacts();
	
	public Contact getContact(long contactId) ;
	
	public Contact addContact(Contact contact);
	
	public Contact updateContact(Contact contact);
	
	public void deleteContact(long parseLong);
}
