 public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        while(row<=2*n - 1){
        // space
        int j = 1;
        while(j<=space){
            System.out.print("  ");
            j++;
        }
               int i = 1;
        while(i<=star){        //star
            System.out.print("* ");
        i++; 
    }  if (row<n){
                star--;
                space+=2;
            } else{
                star++;
                space-=2;
            }
       
        row++;
   
         System.out.println();
        }
    }
}
 
    

