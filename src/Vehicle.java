public interface Vehicle {
    public int getSpeed();
    public void applyBreak();

    public default void autoPilot(){
        System.out.println("I will help in driving with our manual support");
    }
    public static void sayHello(){
        System.out.println("Hi, this is your favourite car");
    }

//    We can have main method inside interface . Since java 8 support static method inside interface
    public static void main(String[] args){
        System.out.println("Hello I am inside interface");
    }
}
