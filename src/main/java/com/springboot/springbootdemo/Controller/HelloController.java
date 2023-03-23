package com.springboot.springbootdemo.Controller;

import com.springboot.springbootdemo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
  @GetMapping("/student")
  Student newStudent(){
    return new Student("Tien", "Khanh");
  }
  
  @GetMapping("/students")
  List<Student> getStudent(){
    List<Student> students = new ArrayList<>();
    students.add(new Student("Tien", "khanh"));
    students.add(new Student("Hoang", "Tran"));
    students.add(new Student("Long", "Nguyen"));
    
    return students;
  }
}
