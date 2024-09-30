package recursionAss;

public class maxValue {
    public static int maximumFinder(int arr[] , int n ){
        // base case coondition
        if(n==1){
            return arr[0];
        }
        {
            return Math.max(arr[n-1], maximumFinder(arr, n-1));
        }
    }
    public static void main(String[] args) {
        int arr[] = { 13, 1, -3, 22, 5};
        int n  = arr.length;
        System.out.println("The maximum value in the array is:" + maximumFinder(arr , n));
    }
}
