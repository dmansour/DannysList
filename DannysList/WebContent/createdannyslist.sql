DROP DATABASE IF EXISTS dannyslist;
CREATE DATABASE dannyslist;

USE dannyslist;

CREATE TABLE users (
	username VARCHAR(30) PRIMARY KEY UNIQUE
);

