package Multi.Homework;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        System.out.println("请输入某年某月某日");
        Scanner console =new Scanner(System.in);
        String s=console.nextLine();
        String [] arr=s.split("年");
        String year1 =arr[0];
        int year = Integer.valueOf(year1);
        String s1 =arr[1];
        String [] arr1=s1.split("月");
        String month1 =arr1[0];
        int month = Integer.valueOf(month1);
        String s2 =arr1[1];
        String [] arr2= s2.split("日");
        String days =arr2   [0];
        int day =Integer.valueOf(days);
       /* System.out.println(year);
        System.out.println(month);
        System.out.println(day);*/
        int t =28;
        if(year%4==0&&year%400!=0){
            t =29;
        }
        int [] arr5 ={31,t,31,30,31,30,31,31,30,31,30,31};
        int allday=0;
        for (int i = 0; i <month-1 ; i++) {
            allday+=arr5[i];
        }
        allday+=day;
        System.out.println(allday);
    }
}
