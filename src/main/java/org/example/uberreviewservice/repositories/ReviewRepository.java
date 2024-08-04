package org.example.uberreviewservice.repositories;


import org.example.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositories are used to communicate with the databases
@Repository // not only makes the code more readable but had other responsibilities
public interface ReviewRepository  extends JpaRepository<Review, Long> {


}
