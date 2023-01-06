package lesson04;

import java.util.*;

public class Exercise01 {

    public static void main(String[] args) {
        ArrayDeque<String> statesAD = new ArrayDeque<>();
        statesAD.add("Germany");
        statesAD.addFirst("France");
        statesAD.push("Great Britain");
        statesAD.addLast("Spain");
        statesAD.add("Italy");
        String sFirst = statesAD.getFirst();
        System.out.println(sFirst);
        String sLast = statesAD.getLast();
        System.out.println(sLast);      // Italy
        System.out.printf("Queue size: %d \n", statesAD.size());  // 5
        while (statesAD.peek() != null) {
            System.out.println(statesAD.pop());
        }

        LinkedList<String> statesLL = new LinkedList<String>();
        statesLL.add("Germany");
        statesLL.add("France");
        statesLL.addLast("Great Britain");
        statesLL.addFirst("Spain");
        statesLL.add(1, "Italy");
        System.out.printf("List has %d elements \n", statesLL.size());
        System.out.println(statesLL.get(1));
        statesLL.set(1, "Portugal");
        for (String state : statesLL) {
            System.out.println(state);
        }
        if (statesLL.contains("Germany")) {
            System.out.println("List contains Germany");
        }
        statesLL.remove("Germany");
        statesLL.removeFirst();
        statesLL.removeLast();

        Map<Integer, String> statesHM = new HashMap<Integer, String>();
        statesHM.put(1, "Germany");
        statesHM.put(2, "Spain");
        statesHM.put(4, "France");
        statesHM.put(3, "Italy");
        String first = statesHM.get(2);
        System.out.println(first);
    }
}




