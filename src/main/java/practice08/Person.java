package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person temp = (Person)(obj);
            return temp.id == this.id && temp.age == this.age && temp.name.equals(this.name);
        }
        return false;
    }
}
