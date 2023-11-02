public class ex3_3 extends Thread{
    public void run() {
        System.out.println("Hello_from_a_thread!");
    }

    public static void main(String args[]) {
        (new Thread(new ex1())).start();
    }
}
