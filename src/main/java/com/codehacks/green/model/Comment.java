package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
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

}
