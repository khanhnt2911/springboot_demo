package com.springboot.springbootdemo.Controller;

import com.springboot.springbootdemo.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
  @GetMapping("/student")
  Student newStudent() {
    return new Student("Tien", "Khanh");
  }
  
  @GetMapping("/students")
  List<Student> getStudent() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Tien", "khanh"));
    students.add(new Student("Hoang", "Tran"));
    students.add(new Student("Long", "Nguyen"));
    
    return students;
  }
  
  //  path variable
  @GetMapping("{firstName}/{lastName}")
  public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                     @PathVariable("lastName") String lastName) {
    return new Student(firstName, lastName);
  }
  
  @GetMapping("/student/query")
  public Student studentRequestParams(@RequestParam(name = "firstName") String firstName,
                                      @RequestParam(name = "lastName") String lastName) {
    return new Student(firstName, lastName);
  }
}
