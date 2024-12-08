package threads;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i =1;i<10;i++){
            System.out.println("I am Runnable Thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread runnableThread = new MyThread();
        Thread t1 = new Thread(runnableThread);
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}
