import java.util.*;
public class lcm  {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int lcm = Math.max(num1 , num2);
while(true){
    if(lcm %num1 == 0 && lcm %num2 ==0){
        System.out.print(lcm);
        break;
    }
    lcm++;
}
    }
}

