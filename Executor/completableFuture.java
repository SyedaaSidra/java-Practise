package Executor;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
public class completableFuture {
    public static void show(){
     var future= CompletableFuture.supplyAsync(()->{
        return 1;
     });
     future.thenAcceptAsync((result)->{
        System.out.println(Thread.currentThread().getName());
         System.out.println(result);
      });
//   try {
//         Thread.sleep(5000);
//     } catch (InterruptedException e) {
   
//         e.printStackTrace();
//     }
     
    }
           
}
