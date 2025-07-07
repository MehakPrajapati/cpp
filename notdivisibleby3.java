public class notdivisibleby3 {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        
        while( i<=n){
            if(i%3 != 0){
                System.out.println("not divisible by 3 = " + i );
            }
            i++;
        }
    }
}
