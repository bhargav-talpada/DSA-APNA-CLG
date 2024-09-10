public class SubsequenceOfStr {
    public static void subSequence(String str, int i, String newStr){
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        // to be
        subSequence(str, i+1, newStr+currChar);

        // not ot be
        subSequence(str, i+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abcd";
        subSequence(str, 0, "");
    }
}
