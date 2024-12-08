public class Honda implements Vehicle{
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Break applied");
    }
    @Override
    public void autoPilot() {
        System.out.println("Honda auto pilot");
    }
    public static void main(String[] args){
        Honda honda = new Honda();
        honda.applyBreak();
        honda.autoPilot();
        Honda.sayHello();
        Vehicle.sayHello();

    }

    private static void sayHello(){
        System.out.println("Hi, this is your favourite Honda car");
    }
}
