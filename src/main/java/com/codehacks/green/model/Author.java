package com.codehacks.green.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(ID, author.ID) && Objects.equals(emailAddress, author.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, emailAddress);
    }
}
