package threads;

public class MyThread1 extends Thread {
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("I am extends Thread "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();

    }
}
