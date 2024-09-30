package recursionAss;
import java.util.*;
public class alter {

    public static int alternateSum(int num){
        //base case condition
        if(num == 0 ){
            return 0;
        }
        else if(num%2 ==0){
            return alternateSum(num-1) -num;
        }
        else{
            return alternateSum(num-1) + num;
        }
    }
    public static void main(String[] args) {
        //find sum of n natural numbers but with alternate signs 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the alternate sum :");
        int num = sc.nextInt();
        System.out.println("The alternate sum will be " + alternateSum(num));
        sc.close();
    }
}
