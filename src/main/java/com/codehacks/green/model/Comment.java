package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name = "Comment")
@Data
public class Comment {

    @Id
    @GeneratedValue
    private UUID Id;

    @OneToOne
    private User user;
    private String comment;
    private LocalDateTime commentDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(Id, comment.Id) && Objects.equals(user, comment.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, user);
    }
}
