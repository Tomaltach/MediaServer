CREATE DATABASE media_server;

CREATE TABLE permission (
	member_id INT NOT NULL,
	permission VARCHAR(25) NOT NULL
);

CREATE TABLE member (
	member_id INT NOT NULL PRIMARY KEY,
	username VARCHAR(50) NOT NULL,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(255) NOT NULL
);

CREATE TABLE movie (
	movie_id INT NOT NULL PRIMARY KEY;
	movie_name VARCHAR(255) NOT NULL,
	movie_genre VARCHAR(25) NOT NULL,
	movie_year INT NOT NULL,
	file_name VARCHAR(255) NOT NULL,
	file_type VARCHAR(10) NOT NULL,
	file_path VARCHAR(255) NOT NULL
);

CREATE TABLE music (
	song_id INT NOT NULL PRIMARY KEY;
	song_name VARCHAR(255) NOT NULL,
	song_genre VARCHAR(25) NOT NULL,
	song_year INT NOT NULL,
	song_artist VARCHAR(50) NOT NULL,
	song_album VARCHAR(50) NOT NULL,
	song_track_no int,
	song_track_no_of int,
	file_name VARCHAR(255) NOT NULL,
	file_type VARCHAR(10) NOT NULL,
	file_path VARCHAR(255) NOT NULL
);

CREATE TABLE book (
	book_id INT NOT NULL PRIMARY KEY,
	book_name VARCHAR(255) NOT NULL,
	book_genre VARCHAR(25) NOT NULL,
	book_year int NOT NULL,
	book_author VARCHAR(50) NOT NULL,
	file_name VARCHAR(255) NOT NULL,
	file_type VARCHAR(10) NOT NULL,
	file_path VARCHAR(255) NOT NULL
);