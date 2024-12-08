package threads;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            // Entering Timed Waiting state
            System.out.println(Thread.currentThread().getName() + " is going to sleep.");
            Thread.sleep(2000); // Timed waiting
            System.out.println(Thread.currentThread().getName() + " woke up.");

            synchronized (this) {
                // Entering Waiting state
                System.out.println(Thread.currentThread().getName() + " is waiting for a notification.");
                wait(); // Waiting state
                System.out.println(Thread.currentThread().getName() + " received a notification.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public synchronized void notifyThread() {
        System.out.println(Thread.currentThread().getName() + " is notifying the waiting thread.");
        notify(); // Notify the waiting thread
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        // New state
        System.out.println(thread1.getName() + " is in New state.");
        thread1.start(); // Runnable state
        thread2.start(); // Runnable state

        // Give thread1 time to go to sleep
        Thread.sleep(1000);

        // Notify thread1 to wake it up
        myRunnable.notifyThread();

        // Ensure the main thread waits for both threads to complete
        thread1.join();
        thread2.join();
        System.out.println("Both threads have completed execution.");
    }
}

