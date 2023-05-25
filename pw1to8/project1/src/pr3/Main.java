package pr3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 21; i++) {
                set.add(i);
            }
        });

        MyList<Integer> list = new MyList<>();
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10; i++){
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Set:");
        set.forEach(System.out::println);

        System.out.println("List:");
        list.forEach(System.out::println);
    }
}