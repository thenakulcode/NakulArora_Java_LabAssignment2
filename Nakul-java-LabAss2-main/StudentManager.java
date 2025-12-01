package service;

import java.util.*;
import model.Student;

public class StudentManager implements RecordActions {

    private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (studentMap.containsKey(s.getRollNo())) {
            System.out.println("Duplicate Roll No Not Allowed!");
            return;
        }
        studentMap.put(s.getRollNo(), s);
        System.out.println("Student Added Successfully");
    }

    @Override
    public void deleteStudent(int rollNo) {
        studentMap.remove(rollNo);
        System.out.println("Student Deleted!");
    }

    @Override
    public void updateStudent(int rollNo, String newCourse, double newMarks) {
        Student s = studentMap.get(rollNo);
        if (s != null) {
            s.setCourse(newCourse);
            s.setMarks(newMarks);
            System.out.println("Student Updated!");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        for (Student s : studentMap.values()) {
            s.displayInfo();
        }
    }
}
