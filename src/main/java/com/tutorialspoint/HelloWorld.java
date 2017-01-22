package com.tutorialspoint;

public class HelloWorld {

	private String message;

	private World world;

	public String getMessage() {
		System.out.println("get message:" + this.message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("set message:" + this.message);
		this.message = message;
	}

	public HelloWorld(String message, World world) {
		super();
		this.message = message;
		this.world = world;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
