/**
 * FiboRecursion
 */
public class FiboRecursion {
    public static void FiboPrint(int a, int b, int n){
        if (n == 0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        FiboPrint(b, c, n-1);
    }
    public static void main(String[] args) {
        int n1=0, n2=1;
        System.out.print(n1+" "+n2+" ");
        int n = 10;
        FiboPrint(n1, n2, n-2);
    }
}