package Multi.Homework;

import java.util.Arrays;
import java.util.Scanner;

/*题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。*/
public class program25 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int a =console.nextInt();
        int [] arr = new int[5];
        int b =0;
        int c= a;
        for (int i = 0; i <5 ; i++) {
            b = c % 10;
            c = c / 10;
            arr[i]=b;
        }
      if(arr[0]==arr[4]&&arr[1]==arr[3]){
          System.out.println(a+"是回文数");
      }else{
          System.out.println(a+"不是回文数");
      }
    }
}
