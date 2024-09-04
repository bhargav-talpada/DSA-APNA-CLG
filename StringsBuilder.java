public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);

        sb.append(' ');
        sb.append('s');
        sb.append('t');
        sb.append('a');
        sb.append('r');
        sb.append('k');
        System.out.println(sb);

        // reverse string
        for (int i = 0; i < sb.length()/2; i++) {
            int f = i;
            int b = sb.length()-1-i;
            char fChar = sb.charAt(f);
            char bChar = sb.charAt(b);
            sb.setCharAt(f, bChar);
            sb.setCharAt(b, fChar);
        }
        System.out.println(sb);
    }
}
