package Multi.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a =console.nextLine();
        byte []arr =a.getBytes();
        Arrays.sort(arr);
        String c=new String(arr);
        System.out.println(c);
        System.out.println("shaib".toString());
    }
}