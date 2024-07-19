import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] CardDeck = {"6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        int randomItem = (int)Math.floor(Math.random() * CardDeck.length);
        String randomItem2 = Integer.toString(randomItem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадай, какую карту я загадал?" + "\n" +
                Arrays.toString(CardDeck));
        String userInput = sc.nextLine();
        boolean result = randomItem2.equalsIgnoreCase(userInput);
        System.out.println("Результат игры: " + result);


    }
}
