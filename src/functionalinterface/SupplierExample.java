package functionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> getMonth = ()-> LocalDate.now().getDayOfMonth();
        System.out.println(getMonth.get());
        Supplier<String> getCurDay = ()->LocalDate.now().getDayOfWeek().name();
        System.out.println(getCurDay.get());
    }
}
