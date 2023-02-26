package com.practiceInterview.InterviewPractice.ServiceImpl;

import com.practiceInterview.InterviewPractice.Entity.Student;
import com.practiceInterview.InterviewPractice.Repository.StudentRepository;
import com.practiceInterview.InterviewPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository stdRepo;


    @Override
    public Student createPost(Student std) {
        Student save = stdRepo.save(std);
        return save;
    }

    @Override
    public List<Student> getAllposts() {
        List<Student> all = stdRepo.findAll();
        return all;
    }

    @Override
    public Student delete(Long sid) {
        Optional<Student> byId = stdRepo.findById(sid);
        Student stud = byId.get();
        if(stud!=null){
            stdRepo.deleteById(sid);
            return stud;
        }else {
             throw new  RuntimeException("Id is not found");
        }
    }

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> byId = stdRepo.findById(student.getSid());
        if(byId.isPresent()) {
            Student student1 = byId.get();
            student1.setSid(student.getSid());
            student1.setStudentName(student.getStudentName());
            student1.setClassName(student.getClassName());
            student1.setTotalMark(student.getTotalMark());
            student1.setSecuredMark(student.getSecuredMark());
            stdRepo.save(student1);
            return student1;
        }else{
            throw new RuntimeException("Given id is not valid!");
        }
    }

    @Override
    public List<Student> getByMarks(Double securedMark) {
//        List<Student> bymark = stdRepo.getBysecuredMark(securedMark);
        if (stdRepo.getBysecuredMark(securedMark)!=null){
            return stdRepo.getBysecuredMark(securedMark);
        }else {
            throw new RuntimeException("value is not present");
        }
    }


}
