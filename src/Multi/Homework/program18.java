package Multi.Homework;

public class program18 {
    public static void main(String[] args) {
            String [] arr1={"a","b","c"};
            String []  arr2={"x","y","z"};
        for (int i = 0; i <3 ; i++) {//a配的人
            for (int j= 0 ; j <3; j++) {//b配的人
         if(i!=j){
             for (int k = 0; k <3 ; k++) {
                 if(i!=k&&j!=k){
                   if(i!=0&&k!=0&&k!=2)  {
                       System.out.println(arr2[i]+"与a对打");
                       System.out.println(arr2[j]+"与b对打");
                       System.out.println(arr2[k]+"与c对打");
                   }
                 }
             }
         }
            }
        }
    }
}
