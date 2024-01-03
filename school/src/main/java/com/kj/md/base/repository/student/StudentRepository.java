package com.kj.md.base.repository.student;

import com.kj.md.base.domain.student.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
}
