package interview;

public abstract class BasicAbstractExample {
    public abstract void display();
    public int x = 10;
    public void  print() {
        System.out.println("not abstract method");
    }
    public BasicAbstractExample(){
        System.out.println("calling through constructor");
    }
    {
        System.out.println("Instance initializer block");
    }
    static {
        System.out.println("Static initializer block");
    }


}
