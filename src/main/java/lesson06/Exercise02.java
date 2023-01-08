package lesson06;

import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise02 {

    public static void main(String[] args) {
        int [] mass00 = new int [1000];
        fillMass(mass00);
        System.out.println(uniqueValues(mass00));
        int [] mass01 = new int [1000];
        fillMass(mass01);
        System.out.println(uniqueValues(mass01));
        int [] mass02 = new int [1000];
        fillMass(mass02);
        System.out.println(uniqueValues(mass02));
        int [] mass03 = new int [1000];
        fillMass(mass03);
        System.out.println(uniqueValues(mass03));
        int [] mass04 = new int [1000];
        fillMass(mass04);
        System.out.println(uniqueValues(mass04));
        int [] mass05 = new int [1000];
        fillMass(mass05);
        System.out.println(uniqueValues(mass05));
        int [] mass06 = new int [1000];
        fillMass(mass06);
        System.out.println(uniqueValues(mass06));
        int [] mass07 = new int [1000];
        fillMass(mass07);
        System.out.println(uniqueValues(mass07));
        int [] mass08 = new int [1000];
        fillMass(mass08);
        System.out.println(uniqueValues(mass08));
        int [] mass09 = new int [1000];
        fillMass(mass09);
        System.out.println(uniqueValues(mass09));
        double average = (uniqueValues(mass00)+uniqueValues(mass01)+uniqueValues(mass02)+uniqueValues(mass03)+uniqueValues(mass04)+uniqueValues(mass05)+uniqueValues(mass06)+uniqueValues(mass07)+uniqueValues(mass08)+uniqueValues(mass09))/10;
        System.out.println("\n"+average);
    }
    public static int[] fillMass(int [] mass) {
        for (int i =0; i <mass.length; i++) {
            mass[i] = new Random().nextInt(1000 - 1) + 1;
        }
        return mass;
    }
    public static double uniqueValues (int [] mass) {
        Set <Integer> tset = new TreeSet<Integer>();
        for(int i : mass) {
            tset.add(i);
        }
        double percentage = (double)tset.size()/10;
        return percentage;
    }
}
