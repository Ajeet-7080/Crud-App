package com.example.crudApp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student_Details")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Student_name", nullable = false)
    private  String name;

    @Column(name="course", nullable = false)
    private String course;

    @Column(name="address",nullable = false)
    private String address;

    @Column(name="mobile_no",nullable = false)
    private String mobileNo;


}
