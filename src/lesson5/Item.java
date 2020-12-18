package lesson5;

public class Item {
    int value;
    int wight;

    public Item(int value, int wight) {
        this.value = value;
        this.wight = wight;
    }

    public int getValue() {
        return value;
    }

    public int getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", wight=" + wight +
                '}';
    }
}
