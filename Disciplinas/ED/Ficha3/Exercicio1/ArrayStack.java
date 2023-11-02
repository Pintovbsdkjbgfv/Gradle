public class ArrayStack<T> implements StackADT{
    
    private int DEFAULT_CAPACITY = 100;
    private T[] stack;
    private int top;
    int size;
    private T[] NovaStack;
    
    
    public ArrayStack (){
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
        }
     
    
    public ArrayStack (int initialCapacity){
        top = 0;
        stack = (T[])(new Object[initialCapacity]);

        }
    
    
    public void push (T element){
        if (size() == stack.length)
        expandCapacity();
        stack[top] = element;
        top++;
    } 

    int size() {
        return top;
    }

    private void expandCapacity() {
        T[] novaStack = (T[])(new Object[stack.length + 100]);
    for (int i = 0; i < stack.length; i++) {
        novaStack[i] = stack[i]; // Copy elements from the old array to the new array
    }
    stack = novaStack; // Update the reference to the new array
    }
    
     public T pop(){
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
        }

    public T peek(){
        return stack[top-1];
        }
    

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String toString() {
        String result = "Element ->";
        for(int i = 0; i< top; i++){
           result += "|" +stack[i] ;
        }
        return result;
    }
    
}
