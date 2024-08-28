package Courses;

import java.util.ArrayList;
import java.util.List;

public class CityStorage {
    private final List<Fruit> fruits;

    public CityStorage() {
        fruits = new ArrayList<>();
    }

    public void addFruits(Fruit[] fruitsToAdd) {
        fruits.addAll(List.of(fruitsToAdd));
    }

    public List<Fruit> sendFruits(Shop shop, int amount) {
        int upperIndex = Math.min(amount, fruits.size());
        List<Fruit> sendingFruits = fruits.subList(0, upperIndex);
        shop.addFruits(sendingFruits);
        List<Fruit> result = new ArrayList<>(sendingFruits);
        sendingFruits.clear();
        return result;
    }

    @Override
    public String toString() {
        return "CityStorage{" +
                "fruits=" + fruits +
                '}';
    }
}