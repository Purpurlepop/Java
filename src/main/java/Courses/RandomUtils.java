package Courses;

import com.github.javafaker.Faker;

public class RandomUtils {
    static Faker faker = Faker.instance();

    // метод для создания рандомного массива фруктов
    public static Fruit[] generateFruits(int maximum) {
        int fruitsAmount = faker.number().numberBetween(10, maximum);
        Fruit[] randomArrays = new Fruit[fruitsAmount];

        for (int i = 0; i < randomArrays.length; i++){
            boolean value = faker.bool().bool();
            Fruit newFruit = value ? generateApple() : generateOrange();
            randomArrays[i] = newFruit;
        }

        return randomArrays;

    }

//метод для создания яблока
    public static Apple generateApple() {
        int weight = faker.number().numberBetween(1, 10);
        String sort = faker.pokemon().name();
        boolean treatedWithWax = faker.bool().bool();
        boolean suitableForMakingCider = faker.bool().bool();
        return new Apple(weight, sort, treatedWithWax, suitableForMakingCider);
    }

    //метод для создания апельсина
     public static Orange generateOrange() {
         int weight = faker.number().numberBetween(1, 15);
         String sort = faker.pokemon().name();
         int peelThickness = faker.number().numberBetween(1, 5);
         int numberOfSlices = faker.number().numberBetween(8, 14);
         return new Orange(weight, sort, peelThickness, numberOfSlices);
     }

}
