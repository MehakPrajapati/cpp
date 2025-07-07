public class patterndemo002 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        while(row<=n){
     //System.out.println("hg");
        // stapce
        int j = 1;
        while(j<=space){
            System.out.print("  ");
            j++;
        }
               int i = 1;
        while(i<=star){        //star
            System.out.print("* ");
        i++; 
    }
        System.out.println();
        row++;
        star--;
        space+=2;
        }
    }
}
