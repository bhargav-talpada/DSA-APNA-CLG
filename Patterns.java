public class Patterns {

    public static void main(String[] args) {
        int n=5;
        // ------ 1. solid rectangle ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 2. Hollow pattern ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if (i==1 || j==1 || i==n || j==n) {
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ------ 3. half pyramid ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 4. inverted half pyramid ------
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 5. inverted half pyramid (rotated by 180deg) ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 6. half pyramid with nummbers ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

        // ------ 7. inverted half pyramid with numbers ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

        // ------ 8. Floyd's triangle ------
        // int c = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //     System.out.println();
        // }

        // ------ 9. 0-1 triangle ------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if ((i+j) % 2 == 0) {
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}