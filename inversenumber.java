
import java.util.Scanner;

public class inversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     System.out.println(Inverselist(n));
    }
    public static int Inverselist(int n) {
     int sum = 0;
     int pos = 1;
while(n>0){
    int rem = n%10;
    sum = (int ) (sum +  pos *  Math.pow(10,rem - 1));
    pos++;
    n = n/10;
}
return sum;
    }
}
