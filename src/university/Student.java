package university;

import java.io.Serializable;

public class Student extends Person  {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + ", Age: " + getAge() + ", Student ID: " + studentId);
    }
}