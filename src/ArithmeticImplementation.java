public class ArithmeticImplementation {

    public static void main(String[] args) {

        ArithmeticOperation oldSum = new ArithmeticOperation() {
            @Override
            public int performOperation(int a, int b) {
                return a+b;
            }
        };
      int y=  oldSum.performOperation(10,20);
        ArithmeticOperation oldSum1 = (a,b)->a*b;
        System.out.println(oldSum1.performOperation(22,67));
        System.out.println(y);
    }
}
