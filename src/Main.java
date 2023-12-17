//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import university.*;
public class Main {
    public static void main(String[] args) {
        UniversitySystemContainer universitySystemContainer=new UniversitySystemContainer();
        Student student1 = new Student("John Doe", 20, 1001);
        Student student2 = new Student("Jane Smith", 22, 1002);
        Teacher teacher1 = new Teacher("Mr. Johnson", 35, "Math");
        Teacher teacher2 = new Teacher("Mrs. Davis", 40, "English");
        universitySystemContainer.addStudent(student1);
        universitySystemContainer.addStudent(student2);
        universitySystemContainer.addTeacher(teacher1);
        universitySystemContainer.addTeacher(teacher2);
        System.out.println("\nStudents:");
        for (Student student : universitySystemContainer.getStudents()) {
            student.displayInfo();
        }
        System.out.println("\nTeachers:");
        for (Teacher teacher : universitySystemContainer.getTeachers()) {
            teacher.displayInfo();
        }
        // Save and load data from file
        universitySystemContainer.saveToFile("school_data.dat");
        universitySystemContainer.getStudents().clear();
        universitySystemContainer.getTeachers().clear();
        universitySystemContainer.loadFromFile("school_data.dat");
        System.out.println("\nAfter loading from file:");
        System.out.println("Students:");
        for (Student student : universitySystemContainer.getStudents()) {
            student.displayInfo();
        }

        System.out.println("\nTeachers:");
        for (Teacher teacher : universitySystemContainer.getTeachers()) {
            teacher.displayInfo();
        }
    }
}