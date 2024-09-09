/**
 * TowerOfHenoi
 */
public class TowerOfHenoi {

    public static void towerOfHenoi(int n, String src, String helper, String des){
        if (n == 1) {
            System.out.println("tranfer disk "+n+" from "+src+" to "+des);
            return;
        }
        towerOfHenoi(n-1, src, des, helper);
        System.out.println("tranfer disk "+n+" from "+src+" to "+des);  
        towerOfHenoi(n-1, helper, src, des);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHenoi(n, "S", "H", "D");
    }
}