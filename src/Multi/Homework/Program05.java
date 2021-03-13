package Multi.Homework;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int score =console.nextInt();
        String level = score>90&&score<100? "A":score>60&&score<89?"B":"C";
        System.out.println("成绩为"+level+"等级");
    }
}
