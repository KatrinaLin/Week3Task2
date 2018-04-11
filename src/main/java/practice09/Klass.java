package practice09;

import java.util.HashSet;

public class Klass {

    private int number;
    private Student leader;
    private HashSet<Student> classStudents;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember (Student student) {

        if (classStudents == null) {
            classStudents = new HashSet<>();
        }

        classStudents.add(student);
    }

    public void assignLeader (Student student) {

        if (classStudents == null || !classStudents.contains(student)) {
            System.out.println("It is not one of us.");
            return;
        }

        leader = student;
    }

    public Student getLeader() {
        return leader;
    }

}
