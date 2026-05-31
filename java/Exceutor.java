import java.util.concurrent.*;
public class Exceutor {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> 10 + 20;
        Future<Integer> result = service.submit(task);
        System.out.println(result.get());
        service.shutdown();
    }
}
