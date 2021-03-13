package Multi.yue;


public class tes02 {
    public tes02() {
    }

    public static void k(){
        tes02 te02=new tes02();
        te02.l();
    }
    public  void l(){
        k();
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            System.out.println("sas");
        }).wait();
    }
}

