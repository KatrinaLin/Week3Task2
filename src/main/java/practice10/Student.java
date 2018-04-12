package practice10;

public class Student extends Person{

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {

        String role = "";

        if (klass.getLeader() != null && klass.getLeader().equals(this)) {
            role = "Leader of ";
        } else {
            role = "at ";
        }

        return super.introduce() + " I am a Student. I am " + role + klass.getDisplayName() + ".";
    }
}
