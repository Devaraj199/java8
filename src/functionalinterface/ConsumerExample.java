package functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input-> System.out.println(input.toUpperCase());
       convertAndDisplay.accept("hello");
       Consumer<String> appendInput = input -> System.out.println("Hello Mr"+input);
       appendInput.andThen(convertAndDisplay).accept("Raju");
    }
}
