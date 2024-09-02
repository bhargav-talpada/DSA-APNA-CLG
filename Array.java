import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Array elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("your array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Enter Search Element");
        int find = sc.nextInt();
        
        for(int i=0; i<arr.length; i++){
            if (find == arr[i]) {
                System.out.println(find+" found at position "+ i);
            }
        }
    }
}
