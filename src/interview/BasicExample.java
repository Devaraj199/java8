package interview;

import java.util.Scanner;

public class BasicExample {
    private static int x;
    {
        System.out.println("instance1 initializer block");
    }
    {
        System.out.println("instance initializer block");
    }
    static {
        x = 20;
        System.out.println("static initializer block"+x);
    }
    static {
        System.out.println("static initializer block1 "+x);
    }

    public  BasicExample(){
        System.out.println("Constructor initializer block");
    }
    public static void main(String[] args) {
        BasicExample basicExample = new BasicExample();
        basicExample.display();
        print();
    }

    void display(){
        System.out.println("I am display method");
    }

    static void print(){
        System.out.println("I am print method");
    }

}
