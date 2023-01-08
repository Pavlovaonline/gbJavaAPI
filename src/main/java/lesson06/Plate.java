package lesson06;
public class Plate {
    private int currentFood;
    public Plate(int currentFood) {
        this.currentFood = currentFood;
    }
    public int decreaseFood(int foodCount) {
        if (currentFood >= foodCount) {
            currentFood -= foodCount;
            return foodCount;
        }
        return foodCount;
    }
}
