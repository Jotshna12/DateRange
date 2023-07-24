package com.example.AMS.service;
import com.example.AMS.Entities.AttendanceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AttendanceService {
    List<AttendanceEntity> findAllStudents();
    Optional<AttendanceEntity> findById(Long id);
    AttendanceEntity saveAttendance(AttendanceEntity attendanceEntity);
    AttendanceEntity updateAttendance(AttendanceEntity attendanceEntity);
    void deleteAttendance(Long id);

    public List<AttendanceEntity>  getbyclassidandsidindaterangeusingJpql( String classID,int studentid, LocalDate startdate ,LocalDate enddate );
    public  List<AttendanceEntity> getallstudentsindaterangeusingJpql( LocalDate startdate, LocalDate enddate);

}
