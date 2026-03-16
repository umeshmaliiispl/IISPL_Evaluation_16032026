package com.iispl.utility; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.iiispl.entity.Student; 

public class Evalution {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("15", "Umesh");
        Student student2 = new Student("12", "Kiran");
        Student student3 = new Student("12", "Amar");

        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("Before Sort" + studentList);
        
//        studentList.stream().
        
        Collections.sort(studentList); 
        System.out.println();
        
        System.out.println("After Sort:- \n" + studentList);
    }
}
