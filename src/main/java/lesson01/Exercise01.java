package lesson01;

import java.util.Arrays;
import java.util.Random;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("\n\tExercise#1");
        System.out.println(exerciseFirst(16, 5));
        System.out.println("\n\tExercise#2");
        exerciseSecond(-5);
        System.out.println("\n\tExercise#3");
        System.out.println(exerciseThird (-5));
        System.out.println("\n\tExercise#4");
        exerciseFourth("Text", 3);
        System.out.println("\n\tExercise#5");
        System.out.println(exerciseFifth(2022));
        System.out.println("\n\tExercise#6");
        exerciseSixth(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println("\n\tExercise#7");
        exerciseSeventh();
        System.out.println("\n\tExercise#8");
        exerciseEighth ();
        System.out.println("\n\tExercise#9");
        exerciseNinth ();
        System.out.println("\n\tExercise#10");
        exerciseTenth(5, 0);
        System.out.println("\n\tExercise#11");
        exerciseEleventh ();
    }
    public static boolean exerciseFirst(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        if (sum>=10&sum<=20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void exerciseSecond (int num) {
        if (num<0) {
            System.out.printf("%d is negative\n", num);
        }
        else if (num>=0) {
            System.out.printf("%d is not negative\n", num);
        }
    }
    public static boolean exerciseThird (int num) {
        if (num < 0) {
            return true;
        } else if (num >= 0) {
            return false;
        }
        return false;
    }
    public static void exerciseFourth (String text, int num) {
            for (int i=0;i<num;i++) {
                System.out.println(text);
            }
        }
    public static boolean exerciseFifth (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
    public static void exerciseSixth (int [] mass) {
        for (int i=0;i<mass.length;i++) {
            if (mass[i] == 0){
                mass[i]=1;
            } else if (mass[i]==1){
                mass[i]=0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void exerciseSeventh () {
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i+1;
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void exerciseEighth () {
        int[] mass = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6){
                mass[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void exerciseNinth () {
        int k = new Random().nextInt(10 - 2)+2; // определяем длину квадратного массива (рандомно, от 2 до 9)
        int[][] mass = new int[k][k];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j  || i+j == mass.length-1) {
                    mass[i][j] = 1;
                } else {
                    Random ran = new Random(); // заполняем остальные элементы рандомными числами от 2 до 9.
                    mass[i][j] = ran.nextInt(10 - 2)+2;
                }
            }
        }
        for (int i=0;i<mass.length;i++){
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]+"\t");}
            System.out.println();
        }
    }
    public static void exerciseTenth (int len, int initialValue) {
        int mass [] = new int[len];
        for (int i = 0; i < len; i++) {
            mass[i] = initialValue;
        }
        System.out.println(Arrays.toString(mass));
    }
    public static void exerciseEleventh () {
        int mass [] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new Random().nextInt(100 - 1)+1;
        }
        System.out.println(Arrays.toString(mass));
        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i< mass.length; i++){
            if (max<mass[i]){
                max = mass[i];
            }
            if (min>mass[i]){
                min = mass[i];
            }
        }
        System.out.printf("Max num: %d.\nMin num: %d.", max, min);
    }
}
