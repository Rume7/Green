package com.codehacks.green.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name="Subscriber")
@Data
public class User {

    @Id
    private UUID Id;

    @NotBlank
    private String username;
    private String firstName;
    private String lastName;

    @NotBlank
    private String emailAddress;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id) && Objects.equals(emailAddress, user.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, emailAddress);
    }
}
