package com.example.Momento1SpringBoot.Models;

public class Teacher {
    private Integer idTeacher;
    private String speciality;

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
