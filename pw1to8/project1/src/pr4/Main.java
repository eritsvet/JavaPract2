package pr4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName());
        };

        ExServ service = new ExServ(2);
        for (int i = 0; i < 7; i++) {
            service.submit(task);
        }

        service.shutdown();
    }
}