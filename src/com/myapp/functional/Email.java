package com.myapp.functional;

public class Email {
	
	private long id;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Email(long id) {
		this.id = id;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	

}
