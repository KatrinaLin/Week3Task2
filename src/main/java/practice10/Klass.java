package practice10;

import java.util.HashSet;

public class Klass {

    private int number;
    private Student leader;
    private HashSet<Student> classStudents;

    public Klass(int number) {
        this.number = number;
        classStudents = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember (Student student) {
        classStudents.add(student);
    }

    public void assignLeader (Student student) {

        if (!isIn(student)) {
            System.out.println("It is not one of us.");
            return;
        }

        leader = student;
    }

    public boolean isIn(Student student) {
        return (classStudents != null) && classStudents.contains(student);
    }

    public Student getLeader() {
        return leader;
    }

}
