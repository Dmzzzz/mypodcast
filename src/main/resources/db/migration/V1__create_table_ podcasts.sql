create table if not exists podcasts (
id SERIAL PRIMARY KEY,
name VARCHAR(128) NOT NULL,
language_type VARCHAR(128) NOT NULL,
topic VARCHAR(128) NOT NULL,
source VARCHAR(128) NOT NULL,
podcast_length VARCHAR(128) NOT NULL,
upload_date TIMESTAMP NOT NULL
);