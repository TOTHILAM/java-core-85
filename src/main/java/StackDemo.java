import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
         //　Thêm phần tử vào đỉnh
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        //xem phần tử ở đỉnh
        int peek = stack.peek();
        System.out.println("peek = " + peek);
        System.out.println(stack);
        // lấy ra phần tử ở đỉnh
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
        // Xủ lí stack. lặp các phần tử trong stack để in ra từ trên xuống dưới
        while (!stack.empty()){
            int top = stack.pop();
            System.out.println("top = " + top);
            System.out.println(stack);
        }
    }
}
