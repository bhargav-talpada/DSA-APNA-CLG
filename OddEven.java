import java.util.Scanner;

public class OddEven {
    public static void EvenOdd(int n){
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
