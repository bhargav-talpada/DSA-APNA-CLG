public class FindOccurenceChar {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int i, char ele){
        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(i);
        if (current == ele) {
            if (first == -1) {
                first = i;
            }
            else{
                last = i;
            }
        }
        findOccurence(str, i+1, ele);
    }

    public static void main(String[] args) {
        String str = "abcaahdkdav";
        findOccurence(str, 0, 'a');
    }
}
