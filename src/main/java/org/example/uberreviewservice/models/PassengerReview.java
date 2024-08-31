package org.example.uberreviewservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@Entity
@PrimaryKeyJoinColumn(name="passenger_review_id")
@NoArgsConstructor
@AllArgsConstructor
public class PassengerReview  extends  Review {


    // Driver will give the passenger rating
    @Column(nullable = false)
    private String passengerReviewContent;

    @Column(nullable = false)
    private Double passengerRating;



}
