                                     //print hollow rectangle

public class Pattern2 {
    public static void main(String[] args) {         
    
        int rows = 5;
        int outer = 4;
        for (int i = 1; i<=rows; i++){
            for( int j= 1; j<=outer; j++){
                if(i ==1 || j ==1 || i== rows || j == outer){      //cell-.(i,j)
                    System.out.print("*"); 
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
}
