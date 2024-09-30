package recursionAss;

public class sovArray {

    public static int sov(int arr[] , int n){
        if(n==1){
            return arr[n];
        }
        {
            return arr[n-1] + sov(arr, n-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {92, 23, 15, -20, 10};
        int n = arr.length;
        System.out.println("The sum of all the values of the array is:" + sov(arr , n));
    }
}
