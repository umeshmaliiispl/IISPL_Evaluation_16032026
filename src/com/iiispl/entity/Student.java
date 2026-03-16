package com.iiispl.entity; 

public class Student implements Comparable<Student> 
{
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

//    //Overrride the compareTO 
//    @Override
//    public int compareTo(Student student) {
//        return this.studentId.compareTo(student.studentId);
//    }
  
    @Override
    public int compareTo(Student other) {
        int idCompare = this.studentId.compareTo(other.studentId);
        
        
        //If the Id is same or same number then It creates 
        if (idCompare != 0) {
            return idCompare;
        }
        
        return this.studentName.compareTo(other.studentName);
    }

	@Override
	public String toString() {
		return "\nStudentId: " + studentId + " StudentName: " + studentName ;
	}
    
    
    

   
    
}
