package javacorep;

/**
 *
 * @author mokle
 */
public class InheriteAdvance {

    public static void main(String[] args) {
        Manager m = new Manager(12, "MMR", "IT");
        m.getDetails();

    }

}

class Employee {

    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void getDetails() {
        System.out.println("Id: " + id + " Name: " + name);
    }

}

class Manager extends Employee {

    String dept;

    public Manager(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    @Override
    void getDetails() {
        System.out.println("Id: " + id + " Name: " + name + " Dept: " + dept); //To change body of generated methods, choose Tools | Templates.
    }

}
