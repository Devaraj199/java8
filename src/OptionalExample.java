import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
//        beforeJava8();
        withJava8();
    }

    public static void beforeJava8(){
        String[] str = new String[10];
        String lowerCaseString = str[5].toLowerCase();
        System.out.println(lowerCaseString);
    }

    public static void withJava8(){
        String[] str = new String[10];
        str[5]="Eazy Bytes";
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        Optional<String> value = Optional.of(str[5]);
        System.out.println(value.get());
        // we should of() when we are sure that value will present,otherwise ofNullable
        Optional<String> nullValue = Optional.ofNullable(str[4]);
        nullValue.ifPresent(System.out::println);
        System.out.println(nullValue.orElse("No value"));

        Optional<String> nonEmptyString = Optional.of("Eazy bytes");
        Optional<String> emptyString = Optional.empty();
        System.out.println("Non empty optional:"+nonEmptyString.map(String::toUpperCase));
        System.out.println("empty optional:"+emptyString.map(String::toUpperCase));

        Optional<String> country = Optional.of("INDIA");
        Optional<String> emptyCountry = Optional.empty();
        System.out.println(country.filter(c->c.equals("india")));
        System.out.println(country.filter(c->c.equalsIgnoreCase("india")).get());
        if(country.isPresent()){
            System.out.println("country is available");
        }
        country.ifPresent(c-> System.out.println("In country value available:"+c));
        // condition will fail no value print
        emptyCountry.ifPresent(c-> System.out.println("In country value available:"+c));
        System.out.println(country.orElse("No country data available"));
        System.out.println(emptyCountry.orElse("No country data available"));

    }
}
