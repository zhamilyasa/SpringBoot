CREATE TABLE users (
                              id BIGINT PRIMARY KEY,
                              username VARCHAR(250),
                              first_name VARCHAR(255),
                              last_name VARCHAR(255),
                              phone_number VARCHAR(20),
                              email_address VARCHAR(255),
                              password VARCHAR(255),
                              additional_notes VARCHAR(255),
                              role VARCHAR(50)
);


