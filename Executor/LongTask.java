package Executor;

public class LongTask {
     public static void simulate(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println("##############1");
     }
    
}
