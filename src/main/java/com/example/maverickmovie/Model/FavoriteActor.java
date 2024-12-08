package com.example.maverickmovie.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "favorite_actor")
public class FavoriteActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long actorId;
    private Long uid;
}
