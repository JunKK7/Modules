package com.kj.md.business.student.service;

import com.kj.md.base.code.StudentCode.GENDER;
import com.kj.md.base.domain.student.Student;
import com.kj.md.base.repository.student.StudentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService
{
    private final StudentRepository studentRepository;

    public List<Student> findStudentList()
    {
        return studentRepository.findAll();
    }

    public Student save()
    {
        //TEST
        Student student = new Student();

        student.setStudentName("김경준");
        student.setAge(31);
        student.setGender(GENDER.MAN);

        return studentRepository.save(student);
    }
}
