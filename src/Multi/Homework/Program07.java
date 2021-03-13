package Multi.Homework;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        int letters=0;
        int space=0;
        int numbers=0;
        int characters=0;
        Scanner console =new Scanner(System.in);
        String str =console.nextLine();
        byte [] bytes=str.getBytes();
        for (int i = 0; i <bytes.length; i++) {
            if(bytes[i]==32){
                space++;
            }
            else if(bytes[i]>=48&&bytes[i]<=57){
                numbers++;
            }
            else if(bytes[i]>=65&&bytes[i]<=90||bytes[i]>=97&&bytes[i]<=142)
            {
                letters++;
            }
            else
            {
                characters++;
            }
        }
        System.out.println(letters);
        System.out.println(characters);
        System.out.println(space);
        System.out.println(numbers);
    }
}
