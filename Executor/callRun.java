package Executor;


    
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.*;

public class callRun {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

      //Runnable
        Runnable runnableFileReader = () -> {
            try {
                // Simulating failure (file doesn't exist)
                String data = Files.readString(Path.of("missing.txt"));
                System.out.println("[Runnable] File content: " + data);
            } catch (IOException e) {
                System.err.println("[Runnable] Error reading file: " + e.getMessage());
            }
        };

        executor.submit(runnableFileReader);
        System.out.println("[Main] Runnable task submitted — no way to know if it failed.");

        // Callable
        Callable<String> callableFileReader = () -> {
            // Same failure (file doesn't exist)
            return Files.readString(Path.of("missing.txt"));
        };

        Future<String> future = executor.submit(callableFileReader);

        try {
            String result = future.get();  // waits & retrieves result
            System.out.println("[Callable] File content: " + result);
        } catch (ExecutionException e) {
            System.err.println("[Callable] Error reported to main: " + e.getCause());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("[Callable] Task was interrupted");
        }

        executor.shutdown();
    }
}

