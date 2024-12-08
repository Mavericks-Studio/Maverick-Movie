package com.example.maverickmovie.Model;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long uid;
    private Long movieId;
    private Long parentCommentId;
    private String commentText;
    private Timestamp createDate;
}
