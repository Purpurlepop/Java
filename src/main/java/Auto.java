public class Auto {

    int quantityOfWheels; // количество колес
    int quantityOfMirrors; // количество зеркал
    static boolean carTrunk; // наличие багажника

    public void turnOnTheWindshieldWiper(){ // включить дворники
        System.out.println("Включили дворники");
    };

    public void startTheCar(){ //завести машину
        System.out.println("Завели двигатель");
    };

    public static int countQuantytiChineseTheCar(String carsLang){ //посчитать количество китайских машин
        String[] quantyti = carsLang.split("");
        return quantyti.length;
    };

    public Auto (int quantityOfWheels, int quantityOfMirrors, boolean carTrunk) {
        this.quantityOfWheels = quantityOfWheels;
        this.quantityOfMirrors = quantityOfMirrors;
    }

    public Auto (int quantityOfWheels) {
        this.quantityOfWheels = quantityOfWheels;
    };
}
