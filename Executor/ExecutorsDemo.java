package Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ExecutorsDemo {
    public static void main(String[] args) {
        //  var executor=  Executors.newFixedThreadPool(2);
        // try {
            
        // var future = executor.submit(()-> {
        //     LongTask.simulate();
        //     return 1;
        // });
        //   System.out.println("Waiting for result...");
        //     Integer result = future.get(); // blocks until the task is done
        //     System.out.println("Result: " + result);
        // } catch (InterruptedException e) {
           
        //     e.printStackTrace();
        // } catch (ExecutionException e) {
           
        //     e.printStackTrace();
        // } finally{
        //     executor.shutdown();
        // }
        completableFuture.show();
        System.out.println("##############");
    }
}
