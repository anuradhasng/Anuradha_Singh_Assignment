
package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import com.coforge.entities.Student;

public interface StudentDaoInterface {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Optional<Student> getStudentById(long id);

    Student updateStudent(Student student);

    void deleteStudent(long id);
}
