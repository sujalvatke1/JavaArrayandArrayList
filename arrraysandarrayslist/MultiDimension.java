package arrraysandarrayslist;
import java.util.Scanner;
public class MultiDimension {

    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
      //  int[][]arr=new int[3][];
        int[][]arr={
             {1,2,3},
             {4 ,5},
             {6,7,8,34,34}
        };
        /*int []arr=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

      }
      System.out.println();*/
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}
    
