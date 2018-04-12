package practice11;

import java.util.HashSet;

public class Klass {
    private int number;
    private Student leader;
    private HashSet<Student> classStudents;
    private HashSet<Teacher> teachers;

    public Klass(int number) {
        this.number = number;
        classStudents = new HashSet<>();
        teachers = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember (Student student) {
        classStudents.add(student);

        if (teachers != null && teachers.size() != 0) {
            teachers.stream()
                    .forEach(t -> System.out.println("I am " + t.getName() + ". I know " + student.getName() + " has joined " + getDisplayName() + "."));
        }
    }

    public void assignLeader (Student student) {

        if (!isIn(student)) {
            System.out.println("It is not one of us.");
            return;
        }

        leader = student;

        if (teachers != null) {
            teachers.stream()
                    .forEach(t -> System.out.println("I am " + t.getName() + ". I know " + student.getName() + " become Leader of " + getDisplayName() + "."));
        }
    }

    public void assignTeacher (Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean isIn(Student student) {
        return (classStudents != null) && classStudents.contains(student);
    }

    public Student getLeader() {
        return leader;
    }

}
