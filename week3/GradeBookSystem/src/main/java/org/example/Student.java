package org.example;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String email;
    private String name;
    private static int studentCount = 0;

    Map<String,Student> studentsHashMap = new HashMap<String Student>();

    Student(String email, String name){
        this.email = email;
        this.name = name;
        studentCount ++;
    }

    int getStudentCount(){return studentCount}

    String generateStudentId(){
        int nextId = getStudentCount() + 1;
        return "s"+ nextId;
    }

    void getAllstudents(){

    }

    void checkWhetherIdExists(String id){}

    void checkWhetherEmailExists(String email){

    }

    void registerStudent(String name, String email){
        studentsHashMap.put(generateStudentId(), name);
        System.out.println("Student:"+ name + "added..");
    }

    void updateStudentDetails(String id){
        getAllstudents();
    }

    void deleteStudent(String id){
        getAllstudents();

    }


}
