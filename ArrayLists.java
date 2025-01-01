import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get elemets
        int ele = list.get(1);
        System.err.println(ele);

        // add element in between
        list.add(2, 5);
        System.err.println(list);

        // set element
        list.set(0, 4);
        System.err.println(list);

        // remove element
        list.remove(3);
        System.err.println(list);

        // size of arraylist
        int s = list.size();
        System.err.println(s);

        // loops
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}