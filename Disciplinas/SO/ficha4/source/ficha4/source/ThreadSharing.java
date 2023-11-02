package ficha4.source;

public class ThreadSharing {

    public static void main(String args[]){
        SharedObj share = new SharedObj();
        Thread tarefa = new Thread( new Run(share), "Printer_thread");
        tarefa.start();
        for (int i=0 ; i<10; i++){
            Thread tarefa2 = new Thread(new Run2(share ,i ));
            tarefa2.setName("NumberedThread:"+i);
            tarefa2.start();
        }
        try{
            Thread.sleep(10000);
            tarefa.interrupt();
        }catch (InterruptedException e) {}
    }
    
}
