package Multi.Homework;

import java.util.Scanner;

public class program26 {
    /*题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。*/
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        String a =console.nextLine();
        String b=a.toLowerCase();
        switch (b){
            case("m"):
                System.out.println("今天星期一");
                break;
            case("w"):
                System.out.println("今天星期三");
                break;
            case("f"):
                System.out.println("今天星期五");
                break;
            case("t"):
                System.out.println("请继续输入一个数字");
                Scanner console1 =new Scanner(System.in);
                String c =console1.nextLine().toLowerCase();
                if(c.equals("u")){
                    System.out.println("今天星期二");
                }else if (c.equals("h"))
                {
                    System.out.println("今天星期四");
                }else{
                    System.out.println("数据错误");
                }
                break;
            case("s"):
                System.out.println("请继续输入一个数字");
                Scanner console2 =new Scanner(System.in);
                String d =console2.nextLine().toLowerCase();
                if(d.equals("a")){
                    System.out.println("今天星期六");
                }else if (d.equals("u"))
                {
                    System.out.println("今天星期天");
                }else{
                    System.out.println("数据错误");
                }
                break;
            default:
                System.out.println("数据错误");
        }
    }
}
