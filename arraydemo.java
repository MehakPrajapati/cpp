import java.util.*;
public class arraydemo {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i< arr.length; i++){
      arr[i] = sc.nextInt();
    }
    display(arr);
   }
   public static void display(int[] arr ){
       for(int i = 0 ; i< arr.length; i++){
      System.out.println(arr[i] + " ");
    }
   System.out.println();
   }
}
