package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        return "B";
    }

    @Override
    public void displayInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
    }

    // Overloaded method
    public void displayInfo(boolean shortInfo) {
        System.out.println("\n[Overloaded] Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public int getRollNo() { return rollNo; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(double marks) { this.marks = marks; }
}
