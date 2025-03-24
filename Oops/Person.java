package Oops;

public class Person {
    private String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
        this.age =18;
    }
    public Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: "+ name +", age: "+age);
    }
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("vimal");
        Person person2 = new Person("Pradeep",25);
        person1.display();
        person2.display();
    }
}



