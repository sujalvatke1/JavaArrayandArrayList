package arrraysandarrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class arryslist {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>(10);
 Scanner in=new Scanner(System.in);
    /*   list.add(99);
         list.add(229);
          list.add(939);
           list.add(9);
            list.add(9923);
             list.add(99);
              list.add(9);
               list.add(993);
                list.add(993);
                 list.add(9932);
 list.remove(3);
list.set(0,88); //set index and add another element

        System.out.println(list);
        System.out.println(list.contains(993));//check the index element 

*/  
//input
for(int i=0;i<5;i++){
    list.add(in.nextInt());

}//output
for(int i=0;i<5;i++){
    System.out.println(list.get(i));
}
    }
    
    
}
