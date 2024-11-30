package com.example.StudentData.Controller;

import com.example.StudentData.Entity.Student;
import com.example.StudentData.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/students")
    @CrossOrigin(origins = "http://localhost:5173")
    public class StudentController {

        @Autowired
        private StudentRepository studentRepository;


        public StudentController(StudentRepository studentRepository) {
            this.studentRepository = studentRepository;
        }

        @PostMapping
        public Student createStudent(@RequestBody Student student) {
            studentRepository.save(student);
            return student;
        }
        @GetMapping
        public List<Student> getAllStudents() {
            return studentRepository.findAll();
        }


    }



