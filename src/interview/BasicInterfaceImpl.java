package interview;

public class  BasicInterfaceImpl implements BasicInterfaceExample{
    @Override
    public void display() {
        System.out.println("Implemented");
    }

    @Override
    public void display1() {
        System.out.println("Implemented 1");
    }

    public static void main(String[] args) {
        BasicInterfaceImpl basicInt = new BasicInterfaceImpl();
        basicInt.display();
        int maxSpeed = MAX_SPEED;
        System.out.println(MAX_SPEED);
        basicInt.dprint();
        BasicInterfaceExample.print();

    }
}
