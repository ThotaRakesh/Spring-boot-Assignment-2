import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
 
package com.example.school;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentH2Service {
    private final StudentRepository studentRepository;

    public StudentH2Service(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> createStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student updateStudent(int studentId, Student student) {
        if (studentRepository.existsById(studentId)) {
            student.setStudentId(studentId);
            return studentRepository.save(student);
        }
        return null;
    }

    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }
}
