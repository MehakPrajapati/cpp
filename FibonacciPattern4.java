import java.util.Scanner;

public class FibonacciPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
int a = 0;
int b = 1;
int c;
while(row<=n){
    int i = 1;
    while(i<=row){
        System.out.print(a + "\t");
  
    c = a+b;
    a = b;
    b = c;
      i++;
}
System.out.println();
row++;
}
    }
}
