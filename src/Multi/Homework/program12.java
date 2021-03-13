package Multi.Homework;

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        System.out.println(pay(a));
    }

    public static double pay(int profit) {
        if(profit<0){
            System.out.println("数据出错");
        }
        if (profit>0&&profit <= 10) {
            return 0.1 * profit;
        }
        if (profit > 10 && profit <= 20) {
            return pay(10) + 0.075 * (profit - 10);
        }
        if (profit > 20 && profit <= 40) {
            return pay(20) + 0.05 * (profit - 20);
        }
        if (profit > 40 && profit <= 60) {
            return pay(40) + 0.03 * (profit - 40);
        }
        if (profit > 60 && profit <= 100) {
            return pay(60) + 0.015 * (profit - 60);
        }
        if (profit > 100) {
            return pay(100) + 0.01 * (profit - 100);
        }
        return 0;
    }
}