package org.example.uberreviewservice.services;


import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.BookingStatus;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepository;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private  ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository)
    {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void run(String... args) throws Exception {

//        Review r = Review.builder()
//                .content("Amazing Ride Quality")
//                .rating(5.0).build();  // code to create the plain java object
//
//        reviewRepository.save(r);
//        Booking b = Booking.builder()
//                        .bookingStatus(BookingStatus.COMPLETED)
//                                .review(r)
//                                        .startDate(new Date())
//                                                .build();
//        bookingRepository.save(b);




    }
}
