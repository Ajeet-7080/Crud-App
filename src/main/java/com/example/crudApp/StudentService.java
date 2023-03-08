package com.example.crudApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired StudentRepository studentRepository;

    // for adding new Student
    public void addStudent(StudentEntity student){
        studentRepository.save(student);
    }

    // for finding new student
    public StudentEntity getStudentById(int id){
        boolean b=studentRepository.existsById(id);
        if(b==true){
            return studentRepository.findById(id).get();
        }
        return null;
    }

    // for Deleting existing Student
    public void deleteStudentById(int id){
        studentRepository.deleteById(id);
    }

    // for updating existing record

    public void updateStudent(StudentEntity student){
        int id= student.getId();
        if(studentRepository.existsById(id)==true){
            studentRepository.save(student);
        }
    }

    
}
