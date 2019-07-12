package practice10;


public class Klass {
    private int number;
    private Student leader;

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

    public void assignLeader(Student student) {
        Boolean flag = student.getKlass() == null || student.getKlass().getNumber() != this.number;
        if (flag) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isInClass(Student student) {
        return student.getKlass().number == this.number;
    }
}