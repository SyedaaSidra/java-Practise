package Tasks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        Thread t = new Thread(() -> {
           
                // Thread.sleep(2000);
                System.out.println("Task complete (async)");
          
        });
        t.start();

        System.out.println("Main thread continues..."); // async behavior
    }
}
