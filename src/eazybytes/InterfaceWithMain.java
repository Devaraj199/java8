package eazybytes;
@FunctionalInterface
public interface InterfaceWithMain {
   public void sayHello(String name,String subName);

   public static void main(String[] args) {
      System.out.println("I am in interface ");
   }
}
