package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity // represents the Review is a table in our databases
@EntityListeners(AuditingEntityListener.class)
public class Review {

        @Id // This annotation states that id column is the primary  key
        @GeneratedValue(strategy = GenerationType.IDENTITY) // identity means auto increment
        private Long id;

        @Column(nullable = false)
        private String content;

        Double rating;

        @Temporal(TemporalType.TIMESTAMP) // tells what format of date  should be stored ie time/timestamp
        @CreatedDate  // tells what value to be stored
        @Column(nullable = false)
        private Date creaetedAt;

        @Temporal(TemporalType.TIMESTAMP)
        @LastModifiedDate
        @Column(nullable = false)
        private Date updatedAt;





}
