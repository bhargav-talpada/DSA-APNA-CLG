import java.util.Scanner;

public class PrimeNum {
    public static void isPrime(int n){
        int c = 0;
        for(int i=1; i<=n; i++){
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}
