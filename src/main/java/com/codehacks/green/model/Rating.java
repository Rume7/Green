package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name="Post_Rating")
@Data
public class Rating {

    @Id
    @GeneratedValue
    private UUID Id;
    private Float rate;
    private LocalDateTime ratingDate;
    private User user;
}
