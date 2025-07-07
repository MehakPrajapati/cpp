import java.util.*;

public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2 + 1;
        int space = -1 ;
        while(row<=n){            //row
            int i = 1;
            while(i<=star){          //star
                System.out.print("* ");
            i++;
        }
    
        int j= 1;
        while(j<=space){   // space
            System.out.print("  ");
            j++;
        }
int k = 1;
if(row==1 || row ==n){
    k = 2;
}
while(k<=star){
    System.out.print("* ");
    k++;
}if(row<=n/2){
  star--;
  space+=2;
}else{
    star++;
    space-=2;
}
        
        row++;
        System.out.println();
    }
}
}