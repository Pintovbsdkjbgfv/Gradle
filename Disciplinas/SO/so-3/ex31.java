public class ex31 {

    final = int id;

    ex31(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Eu_sou_uma_thread!");
    }
    public static void main(String args[]) {
        final int count = Integer.parseInt(args[0]);
        Thread[] th = new Thread[count];

        for(int i = 0; i < count; i++)  {
            ex31 ex1 = new ex31();
            th[1] = new Thread( ex1 );
            th[1] = start();
        }
    }
}
