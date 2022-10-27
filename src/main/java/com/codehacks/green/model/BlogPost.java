package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name = "BlogPost")
@Data
public class BlogPost {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String short_description;

    private String description;

    private LocalDateTime publishedDate;

    @OneToOne
    private Author author;

    @OneToMany
    private List<Comment> commentsList;

    @OneToMany
    private double postRating;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(id, blogPost.id) && Objects.equals(title, blogPost.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
