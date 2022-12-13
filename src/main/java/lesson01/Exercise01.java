package lesson01;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println(exerciseFirst(16, 5));
        exerciseSecond(-5);
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
            System.out.printf("Число %d отрицательное", num);
        }
        else if (num>=0) {
            System.out.printf("Число %d не отрицательное", num);
        }

    }


}
