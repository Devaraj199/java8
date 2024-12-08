package Exception;

public class Exception3 {
    public static void main(String[] args) {
        int i = Integer.parseInt("50");

        // invalid
        // forInputString(A)
        // NumberFormatException will be thrown
//        int j = Integer.parseInt("A");

        // invalid
        // forInputString(five)
        // NumberFormatException will be thrown
//        int k = Integer.parseInt("five");
        String str = null;

        // Calculating length of string

        // Forcefully printing length which throws
        // NullPointerException
//        System.out.println(str.length());
        int n1=7;
        int n2=3;
        if(n1>=0 && n2>=0)
        {
            Exception3.print(n1,n2);
        }
        else
        {
            throw new IllegalStateException("Either one or two numbers are not Positive Integer");
        }
        Thread t = new Thread();

        // valid in thread
        t.setPriority(10);

        // invalid(IllegalArgumentException(IAE))
        t.setPriority(8);
    }
    public static void  print(int a,int b)
    {
        System.out.println("Addition of Positive Integers :"+(a+b));
    }
    public static void methodOne()
    {
        // Defining Method2() in Method1()
        methodTwo();
    }

    // Method2()
    public static void methodTwo()
    {
        // Calling method1 in methos2()
        methodOne();
    }
}
