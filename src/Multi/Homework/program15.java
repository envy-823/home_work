package Multi.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int x =console.nextInt();
        int y =console.nextInt();
        int z =console.nextInt();
        int [] arr ={x,y,z};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
