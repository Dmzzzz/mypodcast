create table if not exists podcasts (
id SERIAL PRIMARY KEY,
name VARCHAR(128) NOT NULL,
languageType VARCHAR(128) NOT NULL,
topic VARCHAR(128) NOT NULL,
source VARCHAR(128) NOT NULL,
podcast_length VARCHAR(128) NOT NULL,
uploadDate TIMESTAMP NOT NULL
);