package com.contactus.contactus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactus.contactus.dao.ContactDao;
import com.contactus.contactus.entities.Contact;

@Service
public class ContactServiceImpl implements ContactServices {
	
	@Autowired
	private ContactDao contactdao;
	
	public ContactServiceImpl() {

	}
	
	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		
		
		return contactdao.findAll();
	}

	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
//		list.add(contact);
		contactdao.save(contact);
		return contact;
	}

	@Override
	public Contact getContact(long contactId) {
		
		return contactdao.getOne(contactId);
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		contactdao.save(contact);
		
		return contact;
	}

	@Override
	public void deleteContact(long parseLong) {
		// TODO Auto-generated method stub
		
		Contact entity = contactdao.getOne(parseLong);
		contactdao.delete(entity);
		
	}

}
