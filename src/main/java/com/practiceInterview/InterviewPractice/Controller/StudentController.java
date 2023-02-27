package com.practiceInterview.InterviewPractice.Controller;

import com.practiceInterview.InterviewPractice.Entity.Student;
import com.practiceInterview.InterviewPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService stdService;

    @PostMapping("/post")
   public ResponseEntity<Student>createPost(@RequestBody Student std){
        Student post = stdService.createPost(std);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>>FindAllPost(){
        List<Student> allposts = stdService.getAllposts();
        return new ResponseEntity<>(allposts, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{Sid}")
    public ResponseEntity<Student>deleteById(@PathVariable("Sid")Long sid){
        Student delete = stdService.delete(sid);
        return new ResponseEntity<>(delete,HttpStatus.OK);
    }
   @PutMapping("/upd/{sid}")
    public ResponseEntity<Student>updateRecordusingSid(@PathVariable("sid")Long Sid,@RequestBody Student student){
        student.setSid(Sid);
       Student update = stdService.updateStudent(student);
       return new ResponseEntity<>(update,HttpStatus.OK);
   }
   @GetMapping("/getby/{securedMark}")
   public ResponseEntity<List<Student>>getallStudentsByMarks(@PathVariable("securedMark")Double securedMark){
       List<Student> byMarks = stdService.getByMarks(securedMark);
       return new ResponseEntity<>(byMarks,HttpStatus.FOUND);
   }
//Here I am Debashis edited the code.
    //hi i am subhrajyoti edited the code
    //all good or not 
//be cool be happy
}
