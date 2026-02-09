package com.college.service;

import com.college.dto.StudentDTO;
import com.college.entity.Student;
import java.util.List;

public interface StudentService {

    Student addStudent(StudentDTO studentDTO);

    List<Student> getAllStudents();
}
