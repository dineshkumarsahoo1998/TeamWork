package com.practiceInterview.InterviewPractice.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="studentINFO")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Sid;
    private String studentName;
    private String className;
    private Double totalMark;
    private Double securedMark;
}
