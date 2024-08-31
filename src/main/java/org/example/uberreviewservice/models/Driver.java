package org.example.uberreviewservice.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "driver")
    List<Booking> booking = new ArrayList<>();

}
