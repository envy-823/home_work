package Multi.Homework;

import java.util.ArrayList;

public class Program03 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 101; i < 1000; i++) {
                num1 = i%10;
                int i1=i/10;
                num2= i1%10;
                int i2=i1/10;
                num3= i2%10;
            if(Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3)==i){
                System.out.println(i);
            }
        }
    }
}
