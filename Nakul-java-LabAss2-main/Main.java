import model.Student;
import service.StudentManager;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 92);
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 88);

        manager.addStudent(s1);
        manager.addStudent(s2);

        System.out.println("\n--- All Students ---");
        manager.viewAllStudents();

        System.out.println("\n--- Overloaded Method Output ---");
        s1.displayInfo(true);

        System.out.println("\n--- Search Student ---");
        Student found = manager.searchStudent(101);
        if (found != null) found.displayInfo();

        System.out.println("\n--- Update Student ---");
        manager.updateStudent(101, "B.Tech (AI)", 95);

        System.out.println("\n--- Final Records ---");
        manager.viewAllStudents();
    }
}
