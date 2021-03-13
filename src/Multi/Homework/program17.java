package Multi.Homework;

public class program17 {
    private int allpeach;
    public static void main(String[] args) {
        for (int i = 0; i <1000000 ; i++) {
            if(theLeftPeach(9,i)==1 ){
                System.out.println(i);
            }

        }

    }
    public static double theLeftPeach(int day,int allpeach){
        if(day==1){
            return allpeach/2-1;
        }
        if(day>1){
            return theLeftPeach(day-1,allpeach)/2-1;
        }
       return 0;
    }
}
