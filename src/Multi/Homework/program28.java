package Multi.Homework;

import java.util.Arrays;
import java.util.Scanner;

/*题目：对10个数进行排序*/
public class program28 {
    public static void main(String[] args) {
        int []arr =new int[10];
        for (int i = 0; i <10 ; i++) {
            Scanner console =new Scanner(System.in);
          arr[i]=console.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
