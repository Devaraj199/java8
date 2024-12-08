public class LambdaExpression1  {

    public static void main(String[] args) {
        // Void method with no param
        VoidMethodWithNoParam method1 = ()-> {
            System.out.println("Printing Hello");
        };
        VoidMethodWithNoParam method2 = ()->System.out.println("Printing Hello");
        method1.printHello();
        method2.printHello();

        // Void method with one param
        VoidMethodWithOneParam oneParam = input-> System.out.println(input.toUpperCase());
        oneParam.printInput("Hello I am Raju pradhan");

        // Void method with two param with addition
        VoidMethodWithTwoParams twoParams1 = (int a,int b)-> System.out.println(a+b);
        VoidMethodWithTwoParams twoParams = (a, b)-> System.out.println(a+b);
        twoParams.calculateAndPrint(12,22);
        twoParams1.calculateAndPrint(11,11);
        // Void method with two param with multiplication
        VoidMethodWithTwoParams twoParams2 = (int a,int b)-> System.out.println(a*b);
        VoidMethodWithTwoParams twoParams3 = (a, b)-> System.out.println(a*b);
        twoParams2.calculateAndPrint(12,22);
        twoParams3.calculateAndPrint(11,11);

        // Return method with two param with addition

        ReturnMethodWithTwoParams twoParams4 = (a,b)-> {return a+b;};
        int x = twoParams4.calculateAndReturn(12,2);
        System.out.println(x);

        ReturnMethodWithTwoParams twoParams5 = (a,b)-> a*b;
        int y = twoParams5.calculateAndReturn(12,2);
        System.out.println(x);


    }


}
