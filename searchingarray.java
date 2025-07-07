public class searchingarray {
    public static void main(String[] args) {
        int[] arr = {3 ,  5, 6 , 2  , 8};
        int item = 5;
        System.out.println(search(arr, item));
    }
    public static int search(int[] arr , int item ) { 
        for (int i = 0; i<arr.length; i++) {
        if(arr[i] == item ){
return i;
        }
       
    } 
     return -1;
        
    }
}
