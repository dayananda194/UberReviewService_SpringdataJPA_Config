package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel
{


    @Id // This annotation states that id column is the primary  key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity means auto increment
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP) // tells what format of date  should be stored ie time/timestamp
    @CreatedDate  // tells what value to be stored
    @Column(nullable = false)
    protected Date creaetedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(nullable = false)
    protected Date updatedAt;


}
