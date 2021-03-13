package Multi;

public class LockDemo1 implements Runnable {
    public int anInt=0;
    @Override
    public void run() {
        payticket();
    }

    public synchronized void payticket (){
        System.out.println(this);
    }

}
