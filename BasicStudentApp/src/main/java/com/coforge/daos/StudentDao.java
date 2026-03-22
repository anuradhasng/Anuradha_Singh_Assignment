package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Student;
import com.coforge.repositories.StudentRepository;

@Repository
public class StudentDao implements StudentDaoInterface {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return repository.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        repository.deleteById(id);
    }
}