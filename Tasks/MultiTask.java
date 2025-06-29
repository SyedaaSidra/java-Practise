package Tasks;
class MultiTask implements Runnable {
    private int taskId;

    public MultiTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {

             if (Thread.interrupted()) // Clears interrupted status!
     throw new InterruptedException();
            switch (taskId) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(threadName + ": Counting " + i);
                       
                    }
                    break;
                case 2:
                    for (char c = 'A'; c <= 'E'; c++) {
                        System.out.println(threadName + ": Letter " + c);
                        
                    }
                    break;
                case 3:
                    for (int i = 2; i <= 10; i += 2) {
                        System.out.println(threadName + ": Even " + i);
                      
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(threadName + ": Square " + (i * i));
                       
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(threadName + ": Hello");
                        
                    }
                    break;
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new MultiTask(i + 1), "Thread-" + (i + 1));
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Error joining thread " + threads[i].getName());
            }
        }

        System.out.println("All threads completed.");
    }
}

