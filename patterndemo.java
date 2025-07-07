
public class patterndemo{
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star =n;
        while(row<= 5){
    int  i = 1;
     while(i<=star){
        System.out.print("+ ");
        i++;
     }            
      //next row 
            System.out.println();
            row++;

        }
    }
}