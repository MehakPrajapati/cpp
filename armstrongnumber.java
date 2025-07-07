
import java.util.Scanner;
public final class armstrongnumber {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
System.out.println(armstrongnumber(n));
 } 
 public static  boolean armstrongnumber(int n) {
    int cod = countdigit(n);
     int sum = 0;
     int p = n;
while(n>0){
    int rem = n %10;
    sum = (int)(sum + Math.pow(rem, cod));
    n = n/10;
       }
          if(sum == p){
           return true;
           }else{
          return false;
       }
      }
 public static int countdigit(int n) {
     int c = 0;
     while(n>0){
        c++;
        n = n/10;
     }
     return c;
 }

}