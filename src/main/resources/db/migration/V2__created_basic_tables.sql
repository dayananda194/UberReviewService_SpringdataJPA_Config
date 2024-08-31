CREATE TABLE if not exists booking
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    created_at     datetime NOT NULL,
    updated_at     datetime NOT NULL,
    review_id      BIGINT NULL,
    booking_status ENUM('SCHEDULED', 'CANCELLED', 'CAB_ARRIVED', 'ASSIGNING_DRIVER', 'IN_RIDE', 'COMPLETED') NULL,
    start_date     datetime NULL,
    end_date       datetime NULL,
    total_distance BIGINT NULL,
    CONSTRAINT pk_booking PRIMARY KEY (id)
);

CREATE TABLE if not exists passenger_review
(
    passenger_review_id      BIGINT       NOT NULL,
    passenger_review_content VARCHAR(255) NOT NULL,
    passenger_rating DOUBLE NOT NULL,
    CONSTRAINT pk_passengerreview PRIMARY KEY (passenger_review_id)
);

CREATE TABLE if not exists review
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime     NOT NULL,
    updated_at datetime     NOT NULL,
    content    VARCHAR(255) NOT NULL,
    rating DOUBLE NULL,
    CONSTRAINT pk_review PRIMARY KEY (id)
);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_REVIEW FOREIGN KEY (review_id) REFERENCES review (id);

ALTER TABLE passenger_review
    ADD CONSTRAINT  FK_PASSENGERREVIEW_ON_PASSENGER_REVIEW FOREIGN KEY (passenger_review_id) REFERENCES review (id);