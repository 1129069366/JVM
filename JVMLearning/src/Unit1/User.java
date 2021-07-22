package Unit1;

/**
 * @program: JVM
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-21 19:12
 **/
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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


    public void print(){
        System.out.println(this.name+" "+ this.age);
    }
}
