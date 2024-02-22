package com.creil.demoCreil.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private final StudentService student;


    public StudentController(StudentService student) {
        this.student = student;
    }

    @GetMapping
    public List<Student> findStudents(){
        return student.findStudents();
    }
}
