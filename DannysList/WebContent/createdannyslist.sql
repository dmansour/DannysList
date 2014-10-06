DROP DATABASE IF EXISTS dannyslist;
CREATE DATABASE dannyslist;

USE dannyslist;

CREATE TABLE users (
	username VARCHAR(30) PRIMARY KEY UNIQUE,
	password VARCHAR(30) NOT NULL
);

INSERT INTO users (username, password) VALUES ("testuser", "testpassword");
