package com.renarouge.demo.rest;

import com.renarouge.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Jéssica", "Santos"));
        theStudents.add(new Student("Leandro", "Leite"));
        theStudents.add(new Student("Isabelly", "Aparecida"));

        return theStudents;
    }

}
