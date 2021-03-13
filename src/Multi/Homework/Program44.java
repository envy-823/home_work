package Multi.Homework;

public class Program44 {
    public static void main(String[] args) {
        for(int x=0;x<20;x++){
            for (int y=0;y<34;y++) {
                if (5*x+3*y+(100 - x - y)/3 == 100&&(100-x-y)%3==0)
                {
                    System.out.println(x);
                    System.out.println(y);
                    System.out.println(100 - x - y);
                }
            }
    }
    }
}
