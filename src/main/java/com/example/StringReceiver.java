package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class StringReceiver {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());	
	
	public void process(Message<String> message){
	
		logger.info(message.getPayload());
	
	}
	
}
