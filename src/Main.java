import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {};
        Stack stack = new Stack(array);
        Queue queue = new Queue(array);

        queue.add(123);
        queue.add(123213);
        System.out.println(queue.peek());
    }
}