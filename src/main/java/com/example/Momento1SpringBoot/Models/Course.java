package com.example.Momento1SpringBoot.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    // Creando realcion  ( Muchosa uno)

    @ManyToOne
    @JoinColumn(name = "fk_docente", referencedColumnName = "id")
    @JsonBackReference
    private Teacher teacher;

}
