public class ex2 extends Thread{

    public void run() {
        System.out.println("Hello_from_a_thread!");
    }

    public static void main(String args[]) {
        (new ex2()).start();
    }
}
