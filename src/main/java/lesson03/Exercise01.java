package lesson03;

        import java.util.ArrayList;
        import java.util.List;

public class Exercise01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(83);
        nums.add(15);
        nums.add(34);
        nums.add(48);
        nums.add(17);
        nums.add(94);
        nums.add(18);
        nums.add(55);
        System.out.println("nums: "+nums);

        int min = nums.get(0);
        int max = nums.get(0);
        float average = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        System.out.println("even nums: "+nums);



        for (int i = 0; i < nums.size(); i++) {
            average += nums.get(i);
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        average = average/nums.size();
        System.out.printf("min num: %d\nmax num: %d\naverage: %f\n", min, max, average);
    }
}
