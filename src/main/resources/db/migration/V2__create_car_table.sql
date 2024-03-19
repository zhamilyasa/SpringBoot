CREATE TABLE car (
                            id BIGINT PRIMARY KEY,
                            brand VARCHAR(255),
                            model VARCHAR(255),
                            year VARCHAR(255),
                            license_plate VARCHAR(20),
                            vin VARCHAR(50),
                            user_id BIGINT,
                            FOREIGN KEY (user_id) REFERENCES public.users (id) -- Ссылка на таблицу users
);