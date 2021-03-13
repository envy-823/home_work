package Multi.Homework;

public class Program02 {
    public static void main(String[] args) {
        int a1;
        int i;
        for (a1 = 101; a1 <= 200; a1++) {
            for (i = 2; i < a1; i++)
                if (a1 % i == 0)
                    break;
                if (i ==a1)
                    System.out.println(a1);
        }
    }
}