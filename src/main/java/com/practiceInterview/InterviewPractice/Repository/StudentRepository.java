package com.practiceInterview.InterviewPractice.Repository;

import com.practiceInterview.InterviewPractice.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Serializable> {
    List<Student> getBysecuredMark(Double securedMark);
}
