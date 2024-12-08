package interview;

public interface BasicInterfaceExample {
    int MAX_SPEED  = 30;
    public abstract void display();
    public abstract void display1();
    static void print(){
        System.out.println("I am static method");
    }
    default void dprint(){
        System.out.println("Hello I am default method");
    }

}
