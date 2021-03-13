package Multi.Homework;

public class program21 {
    public static void main(String[] args) {
        System.out.println(addsum(20));
    }
    public  static  int addsum(int number)
    {
        int result=0;
        for (int i = 1; i < number+1 ; i++) {
            result+=num(i);
        }
        return result;
    }
    public static int num(int a){
        if(a==1){
            return 1;
        }
        if(a>1){
            return num(a-1)*a;
        }
        return 0;
    }
}
