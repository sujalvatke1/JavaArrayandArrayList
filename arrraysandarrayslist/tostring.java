package arrraysandarrayslist;
import java.util.Scanner;
import java.util.Arrays;

public class tostring {
    public static void mian(String[]args){//we create  Arrays object data.
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
