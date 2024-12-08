package eazybytes;

public class LambdaExpression {
    public static void main(String[] args) {
        LambdaExpression le = new LambdaExpression();
        le.VoidMethodWithParams();
    }
    public void VoidMethodWithParams(){
        InterfaceWithMain method = (name,subName)-> System.out.println(name+subName.toUpperCase());
        InterfaceWithMain method1 = (name,subName)-> System.out.println(name+" "+subName.toUpperCase());

        method.sayHello("method","subName");
        method1.sayHello("Method 1","suname");
    }
}
