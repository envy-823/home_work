package Multi.Homework;

public class Program10 {
    public static void main(String[] args) {
        System.out.println(fall(10));
    }
    public static double fall(int number){
        if(number==1){
            return (double) 50;
        }
        else
        {
            return (double)1/2*fall(number-1);
        }
    }
}
