package Multi.Homework;

import java.util.Scanner;

public class program04 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int n =console.nextInt();
        int k=2;
        int count=0;
        if(n==2){
            System.out.println(n+"="+2);
        }
        if(n%k==0&&n!=k){
            System.out.print(n+"=");
            while (true) {
                n = n / k;
                count++;
                if (n == 2) {
                    break;
                }
            }
                for (int i = 0; i <count ; i++) {
                    System.out.print(2+"*");
                }
            System.out.print(2);
            }
        if(n%k!=0&&n!=k){
            System.out.print(n+"=");
            k++;
            while (true){
                if(n%k!=0){
                    k++;
                }
                if(n%k==0){
                    n = n / k;
                    if(n==1){
                        System.out.println(k);
                        break;
                    }
                    System.out.print(k+"*");
                   if(n%k!=0){
                        k++;
                    }
                    if(n==k){
                        System.out.println(k);
                        break;
                    }

                }
            }
        }

    }
}
