
import java.util.Scanner;

public class shopinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int t = sc.nextInt();
while(t>0){
    int n = sc.nextInt();
    int m = sc.nextInt();
    Shoping(m, n);

t--;
}
}
    public static void Shoping(int m , int n) {
        int a = 0 , M = 0 , phone = 1;
while(true){
    a = a+ phone ;
    if(a>m){
        System.out.println("Harshit");
     return ;
    }
    phone++;
    m = m + phone;
    if(m>n){
System.out.println("Aauysh");
    return ;
} phone++;


    }
}
}