import java.util.Arrays;

public class newAuto {
    public static void main(String[] args) {
        Auto myAuto = new Auto(6, 5, true);

        Auto myNewAuto = new Auto (10);

        myAuto.startTheCar();
        myAuto.turnOnTheWindshieldWiper();

        myNewAuto.startTheCar();
        myNewAuto.turnOnTheWindshieldWiper();

        System.out.println("Количество колес у первой машины " + myAuto.quantityOfWheels);
        System.out.println("Количество колес у второй машины " + myNewAuto.quantityOfWheels);
        System.out.println("Количество зеркал у первой машины " + myAuto.quantityOfMirrors);
        System.out.println("Количество зеркал у второй машины " + myNewAuto.quantityOfMirrors);
    }
 }
