CREATE TABLE driver
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    created_at   datetime     NOT NULL,
    updated_at   datetime     NOT NULL,
    name         VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    CONSTRAINT pk_driver PRIMARY KEY (id)
);

ALTER TABLE booking
    ADD driver_id BIGINT NULL;

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

