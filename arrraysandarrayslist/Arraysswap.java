package arrraysandarrayslist;
import java.util.Arrays;
public class Arraysswap {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,};
        change(arr,1,2);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]arr ,int index1 ,int index2){
       int temp=arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
    }
    
}
