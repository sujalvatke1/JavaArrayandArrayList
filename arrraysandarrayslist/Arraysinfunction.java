
package arrraysandarrayslist;
import java.util.Scanner;
import java.util.Arrays;
public class Arraysinfunction {
    public static void main(String[]args){
int []arr={0,2,1,5,3,4};
//System.out.println(Arrays.toString(arr));
//change(arr);
change(arr);
System.out.println(Arrays.toString(arr));

    }
    static void change(int []arr){
arr[1]=1;
arr[2]=2;
arr[3]=4;
arr[4]=5;
arr[5]=3;
    }

    
}
