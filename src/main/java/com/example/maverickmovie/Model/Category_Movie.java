package com.example.maverickmovie.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category_movie")
public class Category_Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long categoryId;
    private Long movieId;
    private String categoryName;
}
