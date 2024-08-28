package Courses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Shop {
    private String address = "unknown";
    private Fruit[] fruits = new Fruit[0];
    private int amountOfFruits = 0;

    public Shop() {
    }

    public Shop(String address) {
        this.address = address;
    }

    public Shop(String address, Fruit[] fruits) {
        this(address);
        this.fruits = fruits;
    }

    public void addFruit(Fruit fruit) {
        List<Fruit> asList = Collections.singletonList(fruit);
        addFruits(asList);
    }

    public void addFruits(List<Fruit> fruitList) {
        if (fruitList.size() > (fruits.length - amountOfFruits)) {
            int newLength = Math.max(fruitList.size(), fruits.length) * 2;
            fruits = Arrays.copyOf(fruits, newLength);
        }
        fruitList.toArray(fruits);
        amountOfFruits += fruitList.size();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", fruits=" + Arrays.toString(fruits) +
                ", amountOfFruits=" + amountOfFruits +
                '}';
    }
}
