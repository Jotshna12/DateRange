package com.example.AMS.repository;
import com.example.AMS.Entities.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Long>{
    @Query("select a from AttendanceEntity a where a.classID=:C and a.studentid=:I and date BETWEEN :start and :end")
     public List<AttendanceEntity> getbyclassidandsidindaterangeusingJpql(@Param("C") String classID,  @Param("I") int studentid, @Param("start") LocalDate startdate, @Param("end") LocalDate enddate);
    @Query("select a from AttendanceEntity a where  a.date BETWEEN :start and :end")
       public  List<AttendanceEntity> getallstudentsindaterangeusingJpql(@Param("start") LocalDate startdate, @Param("end") LocalDate enddate);



}




