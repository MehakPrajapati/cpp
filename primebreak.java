public class primebreak {
    public static void main(String[] args){
    int n = 23;
    int fact = 0;
    for(int i = 2; i <n; i++){
        if(n% i == 0){
            fact++;
            break;
        }
    }
    if(fact >= 1){
        System.out.println("not prime ");
    }
    else{
        System.out.println("prime");
    }
  }
}
