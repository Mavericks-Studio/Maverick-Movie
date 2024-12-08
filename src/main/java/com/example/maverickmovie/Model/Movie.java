package com.example.maverickmovie.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private Integer releaseYear;
    private String descriptions;
    private Integer episode;
    private Integer duration;
    private Long regionId;
    private Boolean subtitle;
    private String director;
    private String movieUrl;
    private String posterUrl;
    private String viewerUrl;
    private String coverUrl;
    private Integer views;
}
