package com.contactus.contactus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contactus.contactus.entities.Contact;
import com.contactus.contactus.services.ContactServices;

@RestController
public class MyController {
	
	@Autowired
	private ContactServices contactservice;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	//get the details
	
	@GetMapping("/contacts")
	
	public List<Contact> getContacts(){
		
		return this.contactservice.getContacts();
		
	}
	
	@GetMapping("/contacts/{contactid}")
	public Contact getContact(@PathVariable String contactid) {
		return this.contactservice.getContact(Long.parseLong(contactid));
	}
	
	@PostMapping("/contacts")
	public Contact addContacts(@RequestBody Contact contact)
	{
		return this.contactservice.addContact(contact);
		
		
	}
	
	@PutMapping("/contacts")
	public Contact updateContact(@RequestBody Contact contact) {
		return this.contactservice.updateContact(contact);
	}
	
	@DeleteMapping("/contacts/{contactid}")
	public ResponseEntity<HttpStatus> deleteContact(@PathVariable String contactid){
		try {
			this.contactservice.deleteContact(Long.parseLong(contactid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
