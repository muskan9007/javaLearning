// 1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.

class First {
    String name;
    int age;
    String adderss;

    First(String Name,int Age, String Address) {
        this.name = Name ;
        this.age = Age ;
        this.adderss = Address ;

    }
}

public class Person {
    public static void main(String[] args)  {    
        First p = new First("Muskan", 20, "test");
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.adderss);
    }
    
}
