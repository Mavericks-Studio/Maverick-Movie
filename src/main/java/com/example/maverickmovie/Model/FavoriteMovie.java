package com.example.maverickmovie.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "favorite_movie")
public class FavoriteMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long movieId;
    private Long uid;
}
