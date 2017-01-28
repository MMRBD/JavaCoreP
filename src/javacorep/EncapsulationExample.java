/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorep;

/**
 *
 * @author mokle
 */
public class EncapsulationExample {

    public static void main(String[] args) {

        Demo d = new Demo(1205, "MMR", "CSE");
        d.display();
    }
}

class Demo {

    private int id;
    private String name;
    private String dept;

    public Demo(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public void display() {
        System.out.println("Demo{" + "id=" + id + ", name=" + name + ", dept=" + dept + '}');
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

}
