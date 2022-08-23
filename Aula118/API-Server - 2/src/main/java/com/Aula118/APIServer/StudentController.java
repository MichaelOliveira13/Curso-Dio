package com.Aula118.APIServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private static Student student = new Student(1,"Michael",26);

    @GetMapping("/student")
    public StudentResponse getStudent(){

        return StudentResponse.builder().id(student.getId()).name(student.getName()).age(student.getAge()).build();

    }
    
}
