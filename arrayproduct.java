public class arrayproduct {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
int [] a = product(arr);
for(int i = 0; i<a.length; i++){
    System.out.print(a[i] + " ");
}
    }
    public static int[] product(int [] arr) {
        int n= arr.length;
        int [] left = new int[n];
        left[0] =1;
        for(int i =1; i<n; i++){
            left[i] = left[i-1] * arr[i-1];
        }
        int [] ryt = new int[n];
ryt[n-1] = 1;
for(int i = n-2; i>=0; i-- ){
 ryt[i] = ryt[i+1] * arr[i+1];
} 
for(int i=0; i<n; i++){
    left[i] = left[i] * ryt[i];
}  
return left;
 }
}
