public class Backtracking {

    public static void printPermutations(String str, String permutation, int i){
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int j=0; j<str.length(); j++){
            char c = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j+1);
            printPermutations(newStr, permutation+c, i+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "", 0);
    }
}
