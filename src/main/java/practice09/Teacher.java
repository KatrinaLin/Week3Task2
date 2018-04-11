package practice09;

public class Teacher extends Person{

    private Klass klass;
    private String IAMTEACHER = " I am a Teacher. ";

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {

        String className = "";

        if (klass == null) {
            className = "No Class";
        } else {
            className = klass.getDisplayName();
        }

        return super.introduce() + IAMTEACHER + "I teach " + className + ".";
    }

    public String introduceWith(Student student) {

        String negative = student.getKlass().equals(klass) ? "" : "don't ";

        return super.introduce() + IAMTEACHER + "I " + negative + "teach " + student.getName() + ".";
    }

}
