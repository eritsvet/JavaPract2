package pr1;
import java.util.function.Predicate;
//Вариант 11
public class Main {
    public static void main(String[] args){
        Predicate<Integer> num = i -> Integer.bitCount(i)==1;
        System.out.println(num.test(2));
        System.out.println(num.test(16));
        System.out.println(num.test(36));
    }
}
