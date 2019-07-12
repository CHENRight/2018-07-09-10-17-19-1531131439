package practice11;


import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();


    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.getNumber());
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }


    public void assignLeader(Student student) {
        Boolean isInClass = student.getKlass() == null || student.getKlass().getNumber() != this.number;
        if (isInClass) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            this.teachers.forEach(curTeacher ->
                    System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", curTeacher.getName(), student.getName(), number))
            );
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        students.add(student);
        this.teachers.forEach(curTeacher ->
                System.out.print(String.format("I am %s. I know %s has joined Class %s.\n", curTeacher.getName(), student.getName(), number))
        );
    }

    public boolean isInClass(Student student) {
        return student.getKlass().number == this.number;
    }
}