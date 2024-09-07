public class PowerRecur {
    public static int power(int n, int x){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int pow = power(n-1, x);
        int pow2 = x * pow;
        return pow2;
    }
    public static void main(String[] args) {
        int ans = power(5, 2);
        System.out.println(ans);
    }
}
