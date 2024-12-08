package interview;

public class FunBasInterfaceExmImpl {
    public static void main(String[] args) {
        FunBasInterfaceExmImpl funBasInterfaceImpl = new FunBasInterfaceExmImpl();
        FunBasInterfaceExm funBasInterfaceExm = funBasInterfaceImpl::instanceCalculate2;
//        FunBasInterfaceExm funBasInterfaceExm = FunBasInterfaceExmImpl::calculate1;
        funBasInterfaceExm.calculate();
    }

    public static void calculate1(){
        System.out.println("Hello1 ");
    }
    public void instanceCalculate2(){
        System.out.println("through instance");
    }

}
