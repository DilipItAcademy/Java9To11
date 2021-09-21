package com.myapp.functional;

public class User {
	
	private Long id;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Long id) {
		this.id = id;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	

}
