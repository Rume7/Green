package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(Id, rating.Id) && Objects.equals(user, rating.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, user);
    }
}
