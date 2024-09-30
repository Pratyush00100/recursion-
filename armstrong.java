package recursionAss;
import java.util.*;
public class armstrong {
    public static int armChecker(int num , int count ){
        if(num == 0){
            return 0;
        }
        {
            return (int)Math.pow(num%10, count)+( armChecker(num/10, count));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong number:");
        int num = sc.nextInt();
        int count = (int) Math.log10(num) + 1;
    int output =     armChecker(num , count);
    if(output == num){
        System.out.println("True!!");
    }
    else{
        System.out.println("False!!");
    }

    sc.close();
    }
}
