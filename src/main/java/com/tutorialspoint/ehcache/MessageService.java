package com.tutorialspoint.ehcache;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;

@Service
public class MessageService {
	private ConcurrentHashMap<Integer, String> messages = new ConcurrentHashMap<Integer, String>();
	
	@Cacheable(cacheName = "messageCache" )
	public String getMessage(Integer id) {
		System.out.println("Getting data from SOR......");
		return messages.get(id);
	}

	public void setMessage(Integer id, String message) {
		messages.put(id, message);
	}
}
