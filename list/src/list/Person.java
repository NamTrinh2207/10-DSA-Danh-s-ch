package list;

public class Person {
    String name;
    int Age;
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name=" + name +
                ", Age=" + Age;
    }
}
