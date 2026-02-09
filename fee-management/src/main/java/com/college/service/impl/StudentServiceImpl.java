package com.college.service.impl;

import com.college.dto.StudentDTO;
import com.college.entity.Student;
import com.college.repository.StudentRepository;
import com.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(StudentDTO dto) {

        Student student = new Student();
        student.setFullName(dto.getFullName());
        student.setCourseProgram(dto.getCourseProgram());
        student.setYearSemester(dto.getYearSemester());
        student.setDivisionSection(dto.getDivisionSection());
        student.setRollNumber(dto.getRollNumber());
        student.setMobileNumber(dto.getMobileNumber());
        student.setEmailId(dto.getEmailId());
        student.setAdmissionDate(dto.getAdmissionDate());
        student.setStatus(dto.getStatus());

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
