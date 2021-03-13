package Multi.Homework;

public class program20 {
    public static void main(String[] args) {
        System.out.println(addsum(20));
    }

    public static double addsum(int number) {
        double result = 0;
        for (int i = 1; i < number + 1; i++) {
            result += (double) fenzi(i)/fenmu(i);
        }
        return result;
    }

    public static int fenmu(int number) {
        if(number==1){
            return 1;
        }
        if(number>1){
            return fenzi(number-1);
        }
        return 0;
    }
    public static int fenzi(int number) {
        if(number==1){
            return 2;
        }
        if(number>1){
            return fenzi(number-1)+fenmu(number-1);
        }
        return 0;
    }
}