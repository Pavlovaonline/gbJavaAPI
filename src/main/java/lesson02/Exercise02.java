package lesson02;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String [] str = s.split("");
        StringBuilder back = new StringBuilder();
        for (int i = str.length; i > 0; i--) {
            back.append(str[i - 1]);
        }
        System.out.println(back);
        if (s.equals(back.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
