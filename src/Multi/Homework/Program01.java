package Multi.Homework;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("在"+n+"月份有"+fun(n)+"对兔子");
    }

private static int fun(int n) {
        if(n ==1||n==2)
        return 1;
        else
            return fun(n-1)+fun(n-2);
        }
}