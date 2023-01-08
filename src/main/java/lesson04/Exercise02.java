package lesson04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        String s;
        do {
        System.out.println("Введите строку вида text~num");
        Scanner in = new Scanner(System.in);
        s = in.next();
        Map<Integer, ArrayList<String>> texts = new HashMap<>();
        System.out.println(textNum(s, texts));
        }
        while (s != "stop");

    }

    public static Map<Integer, ArrayList<String>> textNum(String s, Map<Integer, ArrayList<String>> texts) {
        ArrayList<String> values = new ArrayList<>();
        int key = Integer.parseInt(s.split("~")[1]);
        String[] mass = s.split("~");
//        int key = 0;
//        try {
//            key = Integer.parseInt(mass[1]);
//        } catch (NumberFormatException nfe) {
//            System.out.println("NumberFormatException"); }

        if (texts.containsKey(key)) {
            values = texts.get(key);
            values.add(mass[0]);
//            if (values.contains(mass[0])) {
//                System.out.println("Такой элемент уже есть");
//            } else {
//                values.add(mass[0]);
//                System.out.println("Элемент " + mass[0] + " добавлен");
//            }
        } else {
            values.add(mass[0]);
            texts.put(key, values);
        }
        if (mass[0] == "print") {
            System.out.println(texts.get(key));
            texts.remove(key);
        }
        return texts;
    }
}


