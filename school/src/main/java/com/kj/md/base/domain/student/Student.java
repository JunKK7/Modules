package com.kj.md.base.domain.student;

import com.kj.md.base.code.StudentCode.GENDER;
import com.kj.md.base.convertor.CodeConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Student
{
    @Id
    private Long studentId;

    @Column(length = 10)
    private String studentName;

    @Convert(converter = CodeConverter.class)
    private GENDER gender;

    private Integer age;
}
