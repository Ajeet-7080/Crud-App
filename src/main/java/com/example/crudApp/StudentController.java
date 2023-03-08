package com.example.crudApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired StudentService studentService;

    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody StudentEntity student){
            studentService.addStudent(student);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("id")int id){
        StudentEntity student=studentService.getStudentById(id);
        if(student != null){
            return new ResponseEntity<>(student,HttpStatus.OK);
        }
        return new ResponseEntity("No record found !",HttpStatus.OK);
    }

    @DeleteMapping("/delete_student")
    public ResponseEntity deleteStudent(@RequestParam("id") int id){

        studentService.deleteStudentById(id);
        return new ResponseEntity("Successfully deleted",HttpStatus.OK);
     }


     @PutMapping("/update_student")
    public ResponseEntity updateRecord(@RequestBody StudentEntity student){

        studentService.updateStudent(student);
        return new ResponseEntity("Student record updated successfully",HttpStatus.OK);
     }

}
