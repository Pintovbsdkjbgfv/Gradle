public class ex1 extends Thread {
    public void run() {
        System.out.println("Hello_from_a_thread!");
    }

    public static void main(String args[]) throws InterruptedException{
        
        if (args.length != 1) {
            System.out.println("Uso: java Calculadora <nomeDoc>");
            System.exit(1);
        }

        String nomeDoc = args[0];

        int inteiro = Integer.parseInt(nomeDoc);

        for(int i=0;i < 10;i++){
            (new ex1()).start();
            Thread.sleep(inteiro);
        }
    }
}