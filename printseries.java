
import java.util.Scanner;

public class printseries {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int n = 1;
        int count = 0;
        while(count<N1){
int m = 3*n+2;
if(m % N2 != 0){
System.out.println(m);
count++;
}
n++;
        }
        
    }
}
