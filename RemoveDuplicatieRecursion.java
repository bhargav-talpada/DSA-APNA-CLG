public class RemoveDuplicatieRecursion {
    public static boolean[] map = new boolean[26];
    public static void removeDublicate(String str, int i, String newStr){
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currC = str.charAt(i);
        if (map[currC - 'a']) {
            removeDublicate(str, i+1, newStr);
        }
        else{
            newStr += currC;
            map[currC - 'a'] = true;
            removeDublicate(str, i+1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abcdbhargav";
        removeDublicate(str, 0, "");
    }
}
