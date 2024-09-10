import java.util.HashSet;

public class UniqueSubsequence {
    public static void uniqueSubsequence(String str, int i, String newStr, HashSet<String> set){
        if (i == str.length()) {
            if (set.contains(newStr)) {
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currC = str.charAt(i);
        //to be
        uniqueSubsequence(str, i+1, newStr+currC, set);

        // not to be
        uniqueSubsequence(str, i+1, newStr, set);        
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "" , set);
    }
}
