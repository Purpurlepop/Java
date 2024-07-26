import java.util.Scanner;

public class AddMethodHomework4 {
    public static void main(String[] args) {
        //Напишите метод, который разбивает переданную строку на массив отдельных слов (разделение на строки по символу пробел) и возвращает количество полученных слов (число)
        Instructions1();
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        int result = separationString(userString);
        System.out.printf("В переданной строке %s находится %d слова%n", userString, result);
        String waiting = sc.nextLine();
        //Напишите метод, который принимает в себя два строковых аргумента - имя и фамилию - и выводит на экран в формате "Внимание! Имя Фамилия героически спасает прода от падения! Вам начислено 2 СМ коина.". Метод НЕ возвращает из себя значение.
        Instructions2();
        String userName1 = sc.nextLine();
        String userName2 = sc.nextLine();
        addName(userName1,userName2);
        String waiting1 = sc.nextLine();
        //Напишите метод, который не принимает в себя аргументы и возвращает случайное слово из заданного в самом методе массива слов.
        String word = randomWord();
        System.out.printf(word);
    }

public static void Instructions1(){
    System.out.println("Привет! Введи любую строку и я скажу, сколько в ней слов!");
}

    public static int separationString (String userString1) {
        String[] changedString = userString1.split(" ");
        return changedString.length;

    }
public static void addName (String firstName, String secondName) {
    System.out.printf("Внимание! %s %s героически спасает прод от падения! Вам начислено 2 СМ коина.%n", firstName, secondName);
}

    public static void Instructions2(){
        System.out.println("Привет! Введи сначала свое имя, а затем фамилию!");
    }
    public static String randomWord() {
        String[] randomArrays = {"Лето", "Бассейн", "Работа", "Отпуск"};
        String randomItem = randomArrays[(int)(Math.random() * randomArrays.length)];
        return randomItem;
    }
}


