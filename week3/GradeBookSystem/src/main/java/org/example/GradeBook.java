package org.example;
import java.util.HashMap;
import java.util.Map;


public class GradeBook {
    private Map<String,Student> studentDatabase = new HashMap<>();
    private static int studentCounter = 0;


    // incomplete method
    public void registerStudent(Student studentObject){
        studentCounter ++;
        String generatedId = "R1-"+studentCounter;
        System.out.println("am not yet complete") ;
    }

    public void showAllStudents(){
        if (studentDatabase.isEmpty()) {
            System.out.println("Database is empty...");
            return;
        } else{
            for(Student student: studentDatabase.values()){
                System.out.println("Name: "+ student.getName()+ "   Email: "+ student.getEmail()  );
            }
        }
    }

    public Student getStudent(String id){
        return studentDatabase.get(id);
    }
    public void clearDatabase(){
        studentDatabase.clear();
    }

    public void deleteStudent(String id){
        studentDatabase.remove(id);
    }


}
