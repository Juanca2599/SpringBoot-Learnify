package com.example.Momento1SpringBoot.Models;

import jakarta.persistence.*;

@Entity
@Table (name = "curso")
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_curso")
    private Integer idCourse;

    @Column (name = "nombre", length = 100, unique = false, nullable = false)
    private String name;
}
