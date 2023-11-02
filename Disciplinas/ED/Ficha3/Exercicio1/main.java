
public class main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(30);
        stack.push(60);
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.toString());
    }
}
