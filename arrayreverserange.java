public class arrayreverserange {
    public static void main(String[] args) {
            int [] arr = { 3 , 4, 5 , 6 , 7 , 8 };
reverse(arr , 2 ,4);
    
    for(int i = 0; i< arr.length;  i++){
    System.out.print(arr[i] + " ");
}
    }
    public static void reverse(int[] arr , int i , int j) {
  
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
