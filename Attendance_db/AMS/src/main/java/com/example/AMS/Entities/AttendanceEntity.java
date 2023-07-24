package com.example.AMS.Entities;



import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Attendance")
public class AttendanceEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "class_ID")
    private String classID;
    @Column(name = "student_ID")
    private int studentid;
    @Column(name = "teacher_ID")
    private int teacherid;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "isPresent")
    private boolean IsPresent;


    public AttendanceEntity(){

    }
    public AttendanceEntity(long id, int studentid, int teacherid, LocalDate date, boolean IsPresent, String classID){
        this.id = id;
        this.studentid =studentid;
        this.teacherid =teacherid;
        this.date = date;
        this.IsPresent = IsPresent;
        this.classID = classID;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPresent() {
        return IsPresent;
    }

    public void setPresent(boolean present) {
        IsPresent = present;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
