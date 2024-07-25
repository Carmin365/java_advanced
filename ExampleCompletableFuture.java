import java.util.concurrent.CompletableFuture;

public class ExampleCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return "Result";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        future.thenAccept(System.out::println);
    }
}