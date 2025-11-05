package de.thbrandenburg.rt.timetracker.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "USERS")
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Getter
    @Setter
    @Size(max = 255)
    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Getter
    @Setter
    @Size(max = 255)
    @NotNull
    @Column(name = "PASSWORD", nullable = false)
    private String password;

}