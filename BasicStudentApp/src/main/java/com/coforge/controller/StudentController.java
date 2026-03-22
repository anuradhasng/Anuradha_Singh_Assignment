package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.daos.StudentDaoInterface;
import com.coforge.entities.Student;
import com.coforge.exceptions.StudentNotFoundException;

@RestController
public class StudentController {

    @Autowired
    private StudentDaoInterface dao;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(dao.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<>(dao.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/student/{sid}")
    public ResponseEntity<Student> getStudentById(@PathVariable long sid) {
        Student student = dao.getStudentById(sid)
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/student/{sid}")
    public ResponseEntity<Student> updateStudent(
            @RequestBody Student student,
            @PathVariable long sid) {

        Student existing = dao.getStudentById(sid)
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));

        existing.setSname(student.getSname());
        existing.setCourse(student.getCourse());
        existing.setAddress(student.getAddress());

        return new ResponseEntity<>(dao.updateStudent(existing), HttpStatus.OK);
    }

    @DeleteMapping("/student/{sid}")
    public ResponseEntity<String> deleteStudent(@PathVariable long sid) {
        dao.getStudentById(sid)
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found"));
        dao.deleteStudent(sid);
        return new ResponseEntity<>("Student Deleted Successfully", HttpStatus.OK);
    }
}
