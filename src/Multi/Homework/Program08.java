package Multi.Homework;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int number =console.nextInt();
        int a= console.nextInt();
        int result=addall(number)*a;
        System.out.println(result);
    }
    public static int add(int number) {
        if(number==1){
            return 1;
        }
     return (int) (Math.pow(10,number-1)+add(number-1));
    }
    public static int addall(int number){
        int result=0;
        for (int i = 1; i <number+1 ; i++) {
            result+=add(i);
        }
        return  result;
    }
}
