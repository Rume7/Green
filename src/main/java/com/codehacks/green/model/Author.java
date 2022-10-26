package com.codehacks.green.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Author")
@Data
public class Author {

    @Id
    @GeneratedValue
    private UUID ID;
    private String firstName;
    private String lastName;
    private String emailAddress;


}
