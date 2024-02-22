package com.creil.demoCreil.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findStudents(){
        return List.of(
                new Student(
                        "Aminehjgjg",
                        "Hichri",
                        LocalDate.now(),
                        "amine@gmail.com",
                        41
                ),
                new Student(
                        "Ali",
                        "Mhamdi",
                        LocalDate.now(),
                        "ali@gmail.com",
                        34
                )
        );
    }
}
