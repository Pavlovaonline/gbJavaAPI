package lesson04;

import java.util.LinkedList;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        LinkedList<String> source = new LinkedList<>();
        source.add("001");
        source.add("002");
        source.add("003");
        source.add("004");
        source.add("005");
        source.add("006");
        source.add("007");
        source.add("008");
        source.add("009");
        System.out.println(source);
        System.out.println(reverse(source));
    }

    private static List<String> reverse(LinkedList<String> source) {
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i<source.size(); i++) {
            ll.addFirst(source.getFirst());
            source.remove();
            i--;
            }
        return ll;
    }
}

