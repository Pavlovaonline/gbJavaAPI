package lesson06;

import java.util.HashSet;
import java.util.Set;

public class Exercise01 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Plate plate = new Plate(250);

        Cat gav = new Cat("Gav", 200);
        System.out.println(gav.isSatiety()); // false
        gav.eat(plate);
        System.out.println(gav.isSatiety()); // true

        Cat murzik = new Cat("Murzik", 70);
        System.out.println(murzik.isSatiety()); // false
        murzik.eat(plate);
        System.out.println(murzik.isSatiety()); // false

        System.out.println("===============================");

        System.out.println(gav);
        System.out.println(murzik);
        System.out.println(plate);

        System.out.println(gav.equals(murzik));
        System.out.println(gav.equals(plate));
        Cat anotherGav = new Cat("Gav", 20);
        System.out.println(gav.equals(anotherGav));
        System.out.println(gav.hashCode() == anotherGav.hashCode());


        HashSet<Cat> cats = new HashSet<>();
        cats.add(gav);
        cats.add(anotherGav);
        System.out.println(cats);
    }


}
