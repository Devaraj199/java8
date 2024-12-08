import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        staticMethodReference();
        instanceMethodReference();
        instanceMethodWithClassName();
        constructorReference();
    }

    public static void constructorReference(){
        ProductInterface usingLambda = (name,prize)-> new Product(name,prize);
        Product p1 = usingLambda.getProduct("Samsung",1000);
        System.out.println(p1.toString());

        ProductInterface usingMethodRef = Product::new;
        Product p2 = usingMethodRef.getProduct("Apple",2000);
        System.out.println(p2.toString());
    }
    public static  void instanceMethodWithClassName(){
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("ACCOUNTS");
        departmentList.add("Finance");
        departmentList.forEach(dept-> System.out.println(dept));
        departmentList.forEach(System.out::println);

    }

    public static void staticMethodReference() {
        ArithmeticOperation operation = (a,b)->{
            int sum = a+b;
            System.out.println("The sum of given input value using lambda is: "+ sum);
            return sum;
        };
        operation.performOperation(2,5);

        ArithmeticOperation methodRef = MethodReference::performAddition;
        methodRef.performOperation(2,6);
    }
    public static int performAddition(int x,int y) {
        int sum = x+ y;
        System.out.println("The sum of given input value using static method reference is: "+ sum);
        return sum;
    }

    public  int performInstanceAddition(int x,int y){
        int sum = x+ y;
        System.out.println("The sum of given input value using static method reference is: "+ sum);
        return sum;
    }

    public static void instanceMethodReference() {
        ArithmeticOperation operation = (a,b)->{
            int sum = a+b;
            System.out.println("The sum of given input value using lambda is: "+ sum);
            return sum;
        };
        operation.performOperation(7,9);
        MethodReference m1 = new MethodReference();
        ArithmeticOperation methodRef = m1::performInstanceAddition;
        methodRef.performOperation(9,90);
    }
}

