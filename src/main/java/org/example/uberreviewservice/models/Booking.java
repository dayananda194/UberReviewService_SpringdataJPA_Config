package org.example.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{


    @OneToOne // We have defined one to one relationship between the Booking and Review table
    private Review review; // Contraint unique will be added to the review_id in booking table
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Driver driver;

    Long totalDistance;
}
