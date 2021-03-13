package Multi.Homework;

import java.util.Scanner;

/*题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。*/
public class program24 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int count = 0;
        int b;
        while (a != 0) {
            b = a % 10;
            a = a / 10;
            count++;
            System.out.print(b);
        }
        System.out.println();
        System.out.println(count);
    }
}
