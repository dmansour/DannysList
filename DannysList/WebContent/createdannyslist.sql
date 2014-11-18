/*
 * Please try to keep the FinalStaticDatabaseInfo class up today with the live MySql database. 
 * E.g. if you add, remove, or change something do the same thing to the FinalStaticDatabaseInfo class 
 * found in /src/wtf/dannyslist/. 
 * 
 * If you don't feel like doing then just please tell me ,Johnny ,you change the database and I will
 * updata the FinalStaticDatabaseInfo class. 
 * 
 * Thank you 
 */

DROP DATABASE IF EXISTS dannyslist;
CREATE DATABASE dannyslist;

USE dannyslist;

CREATE TABLE users (
	username VARCHAR(30) PRIMARY KEY UNIQUE,
	password VARCHAR(30) NOT NULL
);

INSERT INTO Users (username, password) VALUES ("testuser", "testpassword");

/*
 *AFL
 *Adding new tables for testing view builder.
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
	newest_order INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(150) UNIQUE,
	platform_id int NOT NULL,
	year INT NOT NULL,
	cost DOUBLE NOT NULL,
	link VARCHAR(500) NOT NULL,
	source VARCHAR(50) NOT NULL,
	search_term VARCHAR(500) NOT NULL,
	PRIMARY KEY(newest_order),
	FOREIGN KEY (platform_id) REFERENCES Platforms(platform_id)
);

CREATE TABLE Searches(
	search_id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(30),
		search VARCHAR(30) NOT NULL,
		PRIMARY KEY(search_id),
	FOREIGN KEY (username) REFERENCES users(username)
);

CREATE TABLE Comments( 
	comment_id INT NOT NULL AUTO_INCREMENT,
	comment VARCHAR(1000) NOT NULL,
	username VARCHAR(30),
	PRIMARY KEY(comment_id)
	);

INSERT INTO Comments  (comment, username) VALUES ("Write something crazy!!!", "testuser");
INSERT INTO Comments  (comment, username) VALUES ("Come stop useing me on the site... ", "Dr. Im");
INSERT INTO Comments  (comment, username) VALUES ("Fine... when we get to the end of the project I will take look at removing things", "Johnny");
INSERT INTO Platforms (platform) VALUES ("N46");
INSERT INTO Platforms (platform) VALUES ("Playstation 3");
INSERT INTO Platforms (platform) VALUES ("Playstation 4");
INSERT INTO Platforms (platform) VALUES ("Xbox 360");
INSERT INTO Platforms (platform) VALUES ("Xbox One");
INSERT INTO Searches (username , search) VALUES ("testuser", "pokemon gold" );
INSERT INTO Games ( name, platform_id, link, year, cost) VALUES ("Dr. Im", 1 , "http://tacksoo.github.io", 1981, 65000.00);

/*
 *AFL
 *End of changes for testing view builder.
 */