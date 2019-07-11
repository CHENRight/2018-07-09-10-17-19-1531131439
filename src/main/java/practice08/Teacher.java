package practice08;


public class Teacher extends Person{
    private Klass klass;

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

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String teachCondition = klass == null ? "No Class" : klass.getDisplayName();
        return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", teachCondition);
    }

    public String introduceWith(Student student){
        String result;
        Boolean flag = klass != null && student.getKlass() != null && klass.getNumber() == student.getKlass().getNumber();
        if(flag){
            result = String.format(" I teach %s.", student.getName());
        }else {
            result = String.format(" I don't teach %s.", student.getName());
        }
        return super.introduce() + " I am a Teacher." + result;
    }
}