package Multi;

public class Demo {
    public static void main(String[] args) {
    /*    System.out.println();
        new Thread(){
            @Override
            public void run() {
                System.out.println(1312);
            }
        };*/
       /* new Thread(()->{
              System.out.println("qeq");
        }).start();*/
//        LockDemo1.class.anInt;
        LockDemo1 lockDemo1=new LockDemo1();
        System.out.println(lockDemo1.anInt);
    }
}
