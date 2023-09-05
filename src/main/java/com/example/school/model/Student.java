// Write your code here
package com.example.school;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String gender;
    private int standard;

    // Constructors, getters, and setters
}
