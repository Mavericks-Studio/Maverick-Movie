package com.example.maverickmovie.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long uid;
    private String playlistTitle;
}
