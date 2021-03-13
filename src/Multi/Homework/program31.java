package Multi.Homework;

/*题目：将一个数组逆序输出。*/
public class program31 {
    public static void main(String[] args) {
        String a="黄彤翔大帅比";
        char [] arr= a.toCharArray();
        for (int i = 0; i <arr.length/2-1 ; i++) {
            char b=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=b;
        }
        System.out.println(new String(arr));
    }
}
