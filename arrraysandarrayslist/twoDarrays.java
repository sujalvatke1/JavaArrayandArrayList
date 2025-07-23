package arrraysandarrayslist;
import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int [][]arr=new int[5][3];
        System.out.println(arr.length);
        
        //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
                //System.out.println(arr[row][col]+" ");
            }
        }
        //output
        /*for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                //int[row][col]=in.nextInt();
                System.out.print(arr[row][col]+" ");
            }
             System.out.println();*/
             
             //for each loop
            /* for(int[]a:arr){
                 System.out.println(Arrays.toString(a));
             }*/
             
             for(int row=0;row<arr.length;row++){
                 System.out.println(Arrays.toString(arr[row]));
            }
            
        }
       
    }
