package threads;


public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        daemonThread.setDaemon(true); // Set as a daemon thread
        daemonThread.start();

        // Main thread work
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread working...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Main thread completed. Exiting...");
    }
}

