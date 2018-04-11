package practice06;

public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {

        if (klass == null) {
            return -1;  // to avoid null pointer exception
        }

        return klass;
    }

    @Override
    public String introduce() {

        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }

        return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
    }
}
