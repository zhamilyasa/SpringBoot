CREATE TABLE maintenance (
                                    id BIGINT PRIMARY KEY,
                                    service_name VARCHAR(255),
                                    description VARCHAR(255),
                                    price VARCHAR(255),
                                    schedule_id BIGINT,
                                    FOREIGN KEY (schedule_id) REFERENCES schedule (id)
);