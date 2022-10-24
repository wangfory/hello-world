import java.util.Date;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    @Test
    public void test(){
        System.out.println("Hello World!aaaaaa");
    }

    @Test
    public void test2(){
        Date data = new Date();
        System.out.println(data);
    }



    
}



class Person{
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
    
    
}
