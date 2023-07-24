package com.example.AMS.service.impl;

import com.example.AMS.Entities.AttendanceEntity;
import com.example.AMS.repository.AttendanceRepository;
import com.example.AMS.service.AttendanceService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    private final AttendanceRepository  attendanceRepository;

    public AttendanceServiceImpl(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public List<AttendanceEntity> findAllStudents() {
        return attendanceRepository.findAll();
    }

    @Override
    public Optional<AttendanceEntity> findById(Long id) {
        return attendanceRepository.findById(id);
    }

    @Override
    public AttendanceEntity saveAttendance(AttendanceEntity attendanceEntity) {
        return attendanceRepository.save(attendanceEntity);
    }

    @Override
    public AttendanceEntity updateAttendance(AttendanceEntity attendanceEntity) {
        return attendanceRepository.save(attendanceEntity);
    }

    @Override
    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);

    }

//    @Override
//    public List<AttendanceEntity> getbyclassidandsidindaterangeusingJpql(int classID, int studentid, Date startdate, Date enddate) {
//        return attendanceRepository.getbyclassidandsidindaterangeusingJpql(classID,studentid,startdate,enddate);
//    }


    @Override
    public List<AttendanceEntity>  getbyclassidandsidindaterangeusingJpql(String classID,int studentid, LocalDate startdate , LocalDate enddate ){
        return attendanceRepository.getbyclassidandsidindaterangeusingJpql(classID,studentid,startdate,enddate);
    }

    @Override
    public  List<AttendanceEntity> getallstudentsindaterangeusingJpql( LocalDate startdate,LocalDate enddate){
        return attendanceRepository.getallstudentsindaterangeusingJpql(startdate, enddate);
    }
}
