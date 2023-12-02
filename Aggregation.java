// University Department Management
// Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.
import java.util.Arrays;


class Faculty {
    String name,position,department;

    void get_details(String name ,String position , String department ) {
        this.name = name;
        this.position = position;
        this.department = department;
    }
}

class Department {
    String name;
    Faculty faculty_members;

    void add_faculty(String name,Faculty member) {
        this.name = name;
        this.faculty_members = member;

        System.out.println("Department " + name + "\nFaculty Name " + faculty_members.name + "\nPosition " + faculty_members.position);
    }
}


public class Aggregation {
    public static void main(String[] args) {
        Faculty member1 = new Faculty();
        member1.get_details("John deo", "Professor", "Computer Science");

        Department dept1 = new Department();
        dept1.add_faculty("Computer Science", member1);


    }
    
}
