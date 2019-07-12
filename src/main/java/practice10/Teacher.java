package practice10;


import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> classes;


    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }


    public LinkedList<Klass> getClasses() {
        return classes;
    }



    @Override
    public String introduce() {
        String teachCondition;
        if(classes != null && classes.size() > 0){
            teachCondition = "Class";
            for(int i = 0;i < classes.size();i++){
                teachCondition += (" " + classes.get(i).getNumber());
                if(i != classes.size() - 1){
                    teachCondition += ",";
                }
            }
        }else{
            teachCondition = "No Class";
        }
        return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", teachCondition);

    }

    public String introduceWith(Student student){
        String result;

        boolean flag = classes != null && classes.size() > 0 && isTeaching(student);
        if(flag){
            result = String.format(" I teach %s.", student.getName());
        }else {
            result = String.format(" I don't teach %s.", student.getName());
        }
        return super.introduce() + " I am a Teacher." + result;
    }

    public boolean isTeaching(Student student){
        for(Klass klass : classes){
            if(klass.isInClass(student)){
                return true;
            }
        }
        return false;
    }
}