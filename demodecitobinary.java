public class demodecitobinary {
    public static void main(String[] args) {
        int n = 10011;
        int sum = 0;
        int nul = 1;
        while(n>0){
            int rem = n%10;
sum = sum + rem *nul;
nul = nul * 2;
n = n/10;
        }
        System.out.println(sum);
    }
  
}
