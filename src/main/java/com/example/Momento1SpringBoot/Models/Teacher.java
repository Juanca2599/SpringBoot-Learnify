package com.example.Momento1SpringBoot.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Teacher {
    private Integer idTeacher;
    private String speciality;

@OneToMany( mappedBy ="teacher")
@JsonManagedReference
private List<Course> course;

    public Teacher(){
    }

    public Teacher(Integer idTeacher, String speciality) {
        this.idTeacher = idTeacher;
        this.speciality = speciality;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
