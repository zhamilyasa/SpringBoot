CREATE TABLE schedule (
                                 id BIGINT PRIMARY KEY,
                                 date_time TIMESTAMP,
                                 additional_notes VARCHAR(255),
                                 car_id BIGINT,
                                 parent_schedule_id BIGINT,
                                 FOREIGN KEY (car_id) REFERENCES car (id),
                                 FOREIGN KEY (parent_schedule_id) REFERENCES schedule (id)
);