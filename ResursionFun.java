public class ResursionFun {
    public static int printN(int n){
        if (n==0) {
            return 1;
        }
        else{
            return n * printN(n-1);      
        }
    }
    public static void main(String[] args) {
        int factorial = printN(0);
        System.out.println(factorial);
    }
}
off
