package com.practiceInterview.InterviewPractice.Service;

import com.practiceInterview.InterviewPractice.Controller.StudentController;
import com.practiceInterview.InterviewPractice.Entity.Student;

import java.util.List;

public interface StudentService {

    Student createPost(Student std);

    List<Student> getAllposts();

    Student delete(Long sid);


    Student updateStudent(Student student);

    List<Student> getByMarks(Double securedMark);
}
