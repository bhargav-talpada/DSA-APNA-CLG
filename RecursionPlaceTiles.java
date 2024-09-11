public class RecursionPlaceTiles {
    public static int placeTiles(int n, int m){

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        
        //vertically
        int vPlace = placeTiles(n-m, m);

        //horizontally
        int hPlace = placeTiles(n-1, m);

        return vPlace + hPlace;

    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n, m));
    }
}
