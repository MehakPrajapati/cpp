public class hcf {
    public static void main(String[] args) {
        int divisor = 36;
        int divident = 60;
        while(divident%divisor != 0){
            int rem = divident % divisor;
divident = divisor;
divisor = rem;
        }
        System.out.println(divisor);
    }
}


/* for(divident%divisor != 0){
            int rem = divident % divisor;
divident = divisor;
divisor = rem;
        } */