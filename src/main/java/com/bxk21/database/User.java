package com.bxk21.database;

public class User {
	private long id;
	private String userName, salt, hash;

	public User(long id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.salt = random();
		this.hash = encrypt(password, this.salt);
	}

	@Override
	public String toString() {
		return String.format(
			"Customer[id=%d, firstName='%s', lastName='%s']",
			id, firstName, lastName);
	}

	// getters & setters omitted for brevity
}
