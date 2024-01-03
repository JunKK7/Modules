package com.kj.md.student.controller;

import com.kj.md.base.domain.student.Student;
import com.kj.md.student.service.StudentService;
import java.net.http.HttpResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController
{
    private final StudentService studentService;
    @GetMapping("/student")
    public HttpEntity<List<Student>> get()
    {
        List<Student> studentList = studentService.findStudentList();
        return new HttpEntity<>(studentList);
    }

    @PostMapping("/student")
    public HttpEntity<Student> post()
    {
        Student save = studentService.save();
        return new HttpEntity<>(save);
    }

}
