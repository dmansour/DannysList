DROP DATABASE IF EXISTS dannyslist;
CREATE DATABASE dannyslist;

USE dannyslist;

CREATE TABLE users (
	username VARCHAR(30) PRIMARY KEY UNIQUE,
	password VARCHAR(30) NOT NULL
);

INSERT INTO users (username, password) VALUES ("testuser", "testpassword");

/*
 *AFL
 *Adding a new tables for testing view builder.
 *Questions
 *Email		: Aflynch@gmail.com
 *Phone 	: 678 900 6694
 */	 
CREATE TABLE Platforms(
	platform_id INT NOT NULL AUTO_INCREMENT,
	platform VARCHAR(30) NOT NULL,
	PRIMARY KEY(platform_id)
);
	
CREATE TABLE Games(
	name VARCHAR(30) PRIMARY KEY UNIQUE,
	platform_id int NOT NULL,
	genres VARCHAR(30) NOT NULL,
	year INT NOT NULL,
	cost DOUBLE NOT NULL,
	FOREIGN KEY (platform_id) REFERENCES Platforms(platform_id)
);

INSERT INTO Platforms (platform) VALUES ("N46");
INSERT INTO Platforms (platform) VALUES ("Playstation");

INSERT INTO games ( name, platform_id, genres, year, cost) VALUES ("Dr. Im", 1 , "Puzzle", 1981, 65000.00);
/*
 *AFL
 *End of changes for testing view builder.
 */