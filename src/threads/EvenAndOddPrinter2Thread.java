package threads;

public class EvenAndOddPrinter2Thread implements Runnable {
    Object object;

    public EvenAndOddPrinter2Thread(Object object) {
        this.object = object;
    }

    static int count = 1;
    @Override
    public void run() {
        while(count<10){
           if(count%2==0&&Thread.currentThread().getName()=="even"){
               synchronized (object){
                   System.out.println("Thread Name "+Thread.currentThread().getName() + " value "+count);
                   count++;
                   try {
                       object.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
            if(count%2!=0&&Thread.currentThread().getName()=="odd"){
                synchronized (object){
                    System.out.println("Thread Name "+Thread.currentThread().getName() + " value "+count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new EvenAndOddPrinter2Thread(lock);
        Runnable r2 = new EvenAndOddPrinter2Thread(lock);
        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();

    }
}
