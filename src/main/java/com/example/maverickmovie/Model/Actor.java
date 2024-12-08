package com.example.maverickmovie.Model;

import java.sql.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String actorName;
    private String gender;
    private String bio;
    private Date birthdate;
    private Long regionId;
    private String image;
}
