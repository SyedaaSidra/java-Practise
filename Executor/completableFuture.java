package Executor;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
public class completableFuture {
    public static void show(){
        Runnable task=()-> System.out.println("runnable task");
         Supplier<Integer> SupplyTask =()->1;
       var future=  CompletableFuture.runAsync(task);
       var supplyFuture=CompletableFuture.supplyAsync(SupplyTask);
          supplyFuture.thenAccept(result ->{
            System.out.println(result);
          });

          System.out.println("12345");
    }
}
