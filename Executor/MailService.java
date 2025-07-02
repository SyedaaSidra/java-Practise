package Executor;

import java.util.concurrent.CompletableFuture;

public class MailService {
    
    public static void send(){
        LongTask.simulate();
    }

    public static CompletableFuture<Void> sendAsync(){
        return CompletableFuture.runAsync(()->send());
    }
}
