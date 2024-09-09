public class ReverseStringRecursion {
    public static void reverseString(String str, int i){
        if (i == 0) {
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        reverseString(str, i-1);
    }
    public static void main(String[] args) {
        String str = "bhargav";
        reverseString(str, str.length()-1);
    }
}
