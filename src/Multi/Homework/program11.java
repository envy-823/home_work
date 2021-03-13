package Multi.Homework;

public class program11 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <5 ; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i!=j&&i!=k&&j!=k){
                        System.out.println(100*i+10*j+k);
                        num++;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
