package arrraysandarrayslist;

import java.util.Scanner;

public class foreachloop {
    
 Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            
        }
        for(int num:arr){// for every element in array, print the element.
           System.out.println(num+" ");//here num represents element of the arrys.
        }
      //System.out.println(arr[4]);
    
}}



