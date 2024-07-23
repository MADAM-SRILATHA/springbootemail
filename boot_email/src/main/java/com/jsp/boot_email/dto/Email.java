package com.jsp.boot_email.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
public class Email {
	String to;
	String subject;
	String body;
	public Email(String to, String subject, String body) {
		super();
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
	
	
}
