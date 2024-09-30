package recursionAss;

public class sod {

    public static int sum(int num){
        //base case condition
        if(num == 0){
            return 0;
        }
        else{
            return num%10 + sum(num/10);
        }
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("the sum of digits will be :" + sum(num));
    }
}
