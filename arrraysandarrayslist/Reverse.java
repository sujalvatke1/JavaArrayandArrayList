package arrraysandarrayslist;
import java.util.Arrays;

public class Reverse {// here we reverse the element in array
    public static void main(String[]args){
        int[]arr={1,23,3,2,32};
        fun(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void fun(int[]arr){
        
        int start=0;
        int end=arr.length-1;
      while(start<end){
        swap(arr,start,end);
        start++;
        end--;

      }
        }
            static void swap(int[]arr ,int index1 ,int index2){
       int temp=arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
    }

    }
    

