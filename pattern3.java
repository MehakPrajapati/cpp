public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){
  int i = 1;
  while(i<=star){
    System.out.print("+ ");
  i++;
}
row++;
star++; 
System.out.println();
        }
    }
}
