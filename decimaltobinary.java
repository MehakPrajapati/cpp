public class decimaltobinary {
    public static void main(String[] args) {
        int n = 25;
        int sum = 0;
        int nul = 1;
        while(n>0){
            int rem = n%2;
sum = sum + rem * nul;
nul = nul * 10;
n = n/2;
        }
        System.out.println(sum);
    }
    
}
