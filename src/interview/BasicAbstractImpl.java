package interview;

public class BasicAbstractImpl extends BasicAbstractExample{
    public static void main(String[] args) {
        BasicAbstractImpl basicAbstract = new BasicAbstractImpl();
        basicAbstract.display();
        basicAbstract.print();
        System.out.println(basicAbstract.x);
    }

    @Override
    public void display() {
        System.out.println("abstract method implementation");
    }

}
