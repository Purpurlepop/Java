package Courses;

public class Main {
    public static void main(String[] args) {
        Fruit[] arraysFruit = RandomUtils.generateFruits(10);

        for (Fruit fruit : arraysFruit) {
            System.out.println(fruit);
        }
        CityStorage cityStorage = new CityStorage();
        cityStorage.addFruits(arraysFruit);
        Shop magnit = new Shop("Moscow, Krasnaya ploschad");
        Shop lenta = new Shop("St. Petersburg, Dvorcovaya ploschad");
        System.out.println("storage is " + cityStorage);
        System.out.println("magnit is " + magnit);
        System.out.println("lenta is " + lenta);
        cityStorage.sendFruits(magnit, 2);
        cityStorage.sendFruits(lenta, 3);
        System.out.println("storage is " + cityStorage);
        System.out.println("magnit is " + magnit);
        System.out.println("lenta is " + lenta);


    }
}
