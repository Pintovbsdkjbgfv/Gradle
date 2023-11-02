public class StackUsingLinkedkist {
    private int length; // indicates the size of the linked list
    private ListNode top;

    // Constructor: Creates an empty stack.
    public StackUsingLinkedkist() {
        length = 0;
        top = null;
    }

    // Adds the specified data to the top of this stack.
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    // Removes the data at the top of this stack and returns a
    // reference to it. Throws an EmptyStackException if the stack
    // is empty.
    public int pop() {;
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    // Returns a reference to the data at the top of this stack.
    // The data is not removed from the stack. Throws an
    // EmptyStackException if the stack is empty.
    public int peek(){
        return top.getData();
    }

    // Returns true if this stack is empty and false otherwise.
    public boolean isEmpty() {
        return (length == 0);
    }

    // Returns the number of elements in the stack.
    public int size() {
        return length;
    }

    // Returns a string representation of this stack.
    public String toString() {
        String result = "";
        ListNode current = top;
        while (current != null) {
            result = result + current.toString() + "\n";
            current = current.getNext();
        }

        return result;
    }

    public static void main(String[] args) {

        StackUsingLinkedkist stack = new StackUsingLinkedkist();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.toString();
  
        System.out.println("Size of stack is: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Top element of stack is: " + stack.peek());

     }
}
