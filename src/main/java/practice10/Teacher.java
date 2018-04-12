package practice10;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private String IAMTEACHER = " I am a Teacher. ";
    private HashSet<Klass> classes = new HashSet<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {

        String className = "";

        if (classes == null || classes.size() == 0) {
            className = "No Class";
        } else {

            String classList = classes.stream()
                    .map(Klass::getNumber)
                    .sorted()
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));

            className = "Class " + classList;
        }

        return super.introduce() + IAMTEACHER + "I teach " + className + ".";
    }

    public String introduceWith(Student student) {

        String negative = isTeaching(student) ? "" : "don't ";

        return super.introduce() + IAMTEACHER + "I " + negative + "teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {

        return classes.contains(student.getKlass());

    }

}
