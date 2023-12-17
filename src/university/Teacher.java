package university;

import java.io.Serializable;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge() + ", Subject: " + subject);
    }
}
