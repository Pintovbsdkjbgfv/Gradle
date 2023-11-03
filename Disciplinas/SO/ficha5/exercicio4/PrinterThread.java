public class PrinterThread extends Thread{
    protected counter count = null;
    public PrinterThread(counter c) {
        this.counter = c;
    }
    public void run() {
        synchronized(counter){
            for(int i=0;i < 100; i++){
                counter.add(1);
                System.out.println(Thread.current().getname()+this.counter.get.count());
            }
        }
    }
}
