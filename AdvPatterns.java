public class AdvPatterns {
    public static void main(String[] args) {

        int n = 5;

        // ------ 1. butterfly pattern ------
            //  upper part
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
                // space
        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
            // lower part
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
                // space
        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 2. solid rhombus ------
        // for(int i=1; i<=n; i++){
                // space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ------ 3. number pyramid ------
        // for(int i=1; i<=n; i++){
        //     // space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+ " ");
        //     }
        //     System.out.println();
        // }

        // ------ 4. Palinndromic pattern ------
        // for(int i=1; i<=n; i++){
            //  space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j+" ");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // ------ 5. Dimond pattern ------
            // upper part
        // for(int i=1; i<=n; i++){
            // space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
            //  lower part
        // for(int i=n; i>=1; i--){
            // space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
