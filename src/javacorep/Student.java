
package javacorep;

/**
 *
 * @author mokle
 */
public class Student implements Comparable{
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        Student st = (Student) obj;
        
        System.out.println("Compare to  "+this.age+"  And  "+st.age);
        return this.age - st.age;
    }
    
}
