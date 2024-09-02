import java.util.Scanner;

public class HWArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of your array : ");
        int size = sc.nextInt();

        // String[] arr = new String[size];
        // System.out.println("Enter your array value : ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextLine();
        // }

        // System.out.println("Your array : ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }    
        
// ------------------------------------------------------------
        
        // int[] arr = new int[size];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
    
        // System.out.println("Your array : ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }

        // int max = arr[0];
        // int min = arr[0];
        // for(int i=0; i<arr.length; i++){
        //     if (max < arr[i]) {
        //         max = arr[i];
        //     }
        //     if (min > arr[i]) {
        //         min = arr[i];
        //     }
        // }
        // System.out.println("max element is : "+ max);
        // System.out.println("min element is : "+ min);

//---------------------------------------------------------------

        int[] arr = new int[size];
        System.out.println("Enter array element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        boolean ascending = true;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
                ascending = false;
            }
        }
        System.out.println(ascending ? "Ascending order" : "Not in Ascending order");

    }
}
