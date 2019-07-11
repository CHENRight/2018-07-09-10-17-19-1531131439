package practice08;


public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        boolean isLeader = klass != null && klass.getLeader() != null && klass.getLeader().getName().equals(this.getName());
        if(isLeader){
            return  super.introduce() + " " + String.format("I am a Student. I am Leader of %s.", klass.getDisplayName());
        }else {
            return super.introduce() + " " + String.format("I am a Student. I am at Class %d.", klass.getNumber());
        }
    }
}

