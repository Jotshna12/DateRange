package com.example.AMS.Controller;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.AMS.Entities.AttendanceEntity;
import com.example.AMS.service.AttendanceService;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/attendancerecord")
public class AttendanceController  implements AttendanceService{
    private final AttendanceService attendanceService;


    public AttendanceController(AttendanceService attendanceService) {

        this.attendanceService = attendanceService;
    }


    @GetMapping("/allstudent")
    public List<AttendanceEntity> findAllStudents() {

        return attendanceService.findAllStudents();
    }


    @GetMapping("/recordbyid/{id}")
    public Optional<AttendanceEntity> findById(@PathVariable("id") Long id) {

        return attendanceService.findById(id);
    }

    @PostMapping("/addrecord")
    public AttendanceEntity saveAttendance(@RequestBody AttendanceEntity attendanceEntity) {
        return attendanceService.saveAttendance(attendanceEntity);
    }

    @PutMapping("/update")
    public AttendanceEntity updateAttendance(@RequestBody AttendanceEntity attendanceEntity) {
        return attendanceService.updateAttendance(attendanceEntity);
    }

    @DeleteMapping("/recordbyid/{id}")
    public void deleteAttendance(@PathVariable("id") Long id) {
        attendanceService.deleteAttendance(id);
    }

    @GetMapping("/rangebyid/{classID}/{studentid}/{startdate}/{enddate}")
   public List<AttendanceEntity>  getbyclassidandsidindaterangeusingJpql(@PathVariable String classID,@PathVariable int studentid, @PathVariable LocalDate startdate , @PathVariable LocalDate enddate )
   {
      return attendanceService.getbyclassidandsidindaterangeusingJpql(classID,studentid,startdate,enddate);
   }

   @GetMapping("/dateranebyall/{startdate}/{enddate}")
   public List<AttendanceEntity> getallstudentsindaterangeusingJpql ( @PathVariable LocalDate startdate , @PathVariable LocalDate enddate )
   {
       return attendanceService.getallstudentsindaterangeusingJpql(startdate,enddate);
   }
}