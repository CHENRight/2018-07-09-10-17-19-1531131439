package practice11;



public class Person {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person temp = (Person)(obj);
            return temp.id == this.id && temp.age == this.age&& temp.name.equals(this.name);
        }
        return false;
    }
}