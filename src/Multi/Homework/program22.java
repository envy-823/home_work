package Multi.Homework;

public class program22 {
    public static void main(String[] args) {
        System.out.println(num(5));
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
