package org.example.uberreviewservice.services;


import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {

    private  ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Review r = Review.builder()
                .content("Amazing Ride Quality")
                .rating(5.0).build();  // code to create the plain java object
        System.out.println(r.toString());
        reviewRepository.save(r); // this code will execute the sql query


    }
}
