package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
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


}
