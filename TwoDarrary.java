import java.util.Scanner;

public class TwoDarrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows Size : ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns Size : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
    // -------------------- input & output 2D array --------------------
        System.out.println("Enter Array Element : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    // -------------------- search element --------------------

        System.out.println("Enter Search element : ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if (arr[i][j] == x) {
                    System.out.println(x + " found at ( " + i + ", " +j + " )");
                }
            }
            
        }
    }
}
