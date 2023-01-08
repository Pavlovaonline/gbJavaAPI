package lesson06;
import java.util.Objects;
public class Cat extends Object{
    private String name;
    private int appetite;
    private int satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = 10;
    }
    public void eat(Plate plate) {
        if (satiety>=10) {
            satiety +=10;
            System.out.printf("Кот %s сытый. Кот стал толще на 10.\n", name);
            return;
        }
        satiety = plate.decreaseFood(appetite);
        if (satiety>=10) {
            satiety +=appetite;
            System.out.printf("Кот %s наелся. Кот стал толще на 10.\n", name);
        } else {
            System.out.printf("Кот %s не поел.", name);
        }
    }
    public int isSatiety() {
        return satiety;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return appetite == cat.appetite && name.equals(cat.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, appetite);
    }
    @Override
    public String toString() {
        return "Cat[" + name + "]";
    }
}
