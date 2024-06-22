import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue = new LinkedList<>();

        //  thêm phần tử vào cuối hàng đợi
        queue.offer(2);
        queue.offer(8);
        queue.offer(5);
        queue.offer(7);
        System.out.println(queue);

        // xem phần tử ở đầu hàng đợi
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println(queue);

        // lấy phần tử ở đầu hàng đợi
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);

        // xử lí queue
        while (!queue.isEmpty()){
            System.out.println("queue.poll() = " + queue.poll());
            System.out.println(queue);
        }
    }
}
