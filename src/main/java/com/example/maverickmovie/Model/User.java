package com.example.maverickmovie.Model;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long uid;
    private Long roleId;
    private String name;
    private String email;
    private String password;
    private Boolean isActive;
    private String gender;
    private String address;
    private Integer age;
    private String phoneNumber;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String profileUrl;
}
