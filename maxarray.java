public class maxarray {
    public static void main(String[] args) {
        int [] arr = { 3 , 5 , 6 , 1 , 2};
        System.out.println(max(arr));
    }
       public static int max1(int [] arr ) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length ; i++){
//             if(arr[i] > max ){         
//    max = arr[i];
//             }

max = Math.max(max, arr[i]);
        
        } 
        return  max;
    }
    public static int max(int [] arr ) {
        int max = arr[0];
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] > max ){
   max = arr[i];
            }
        
        } return  max;
    }
}
