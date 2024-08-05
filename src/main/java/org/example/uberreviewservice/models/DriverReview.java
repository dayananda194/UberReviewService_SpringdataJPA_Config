package org.example.uberreviewservice.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class DriverReview extends  Review{

    private String driverReviewComment;


}
