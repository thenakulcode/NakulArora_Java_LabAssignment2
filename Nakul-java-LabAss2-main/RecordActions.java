package service;

import model.Student;

public interface RecordActions {
    void addStudent(Student s);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, String newCourse, double newMarks);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}
