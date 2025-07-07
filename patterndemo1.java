public class patterndemo1 {
    public static void main(String[] args) {
        int n = 5;
      int  row = 1;
        int star = n;
        while(row<=n){
          int i = 1;
          while (i<=star) {  //star
              System.out.print("* ");
              i++;
          }
            
          star--;
          row++;
          System.out.println();
        }}
    }