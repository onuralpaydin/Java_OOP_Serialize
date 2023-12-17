package university;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class UniversitySystemContainer implements Serializable {

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private static final long serialVersionUID = 1L;

    public UniversitySystemContainer() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            oos.writeObject(teachers);
            System.out.println("Data saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (ArrayList<Student>) ois.readObject();
            teachers = (ArrayList<Teacher>) ois.readObject();
            System.out.println("Data loaded from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        }
    }
}