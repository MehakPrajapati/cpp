public class arrayswap {
    public static void main(String[] args) {
        int[] arr = { 10 , 2 , 4 ,8 };
        int[] other = { 12 , 34 , 45 ,56 };
        System.out.println(arr[0] + " "+ other[0] );
        swap(arr , other);
        System.out.println(arr[0] + " " + other[0]);

    }
    public static void swap(int [] arr, int [] other) {
        int[] temp = arr;
        arr = temp;
    other = temp;    }
}
