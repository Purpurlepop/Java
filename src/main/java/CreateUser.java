import java.util.Arrays;

public class CreateUser {
    public static void main(String[] args) {
        User[] arraysUsers = new User[10];
        String[] names = {"Никита", "Евгений", "Пётр", "Алексей", "Владимир"};
        String[] secondNames = {"Васильев", "Егоров", "Николаев", "Жлобин", "Круглов"};
        for (int i = 0; i < arraysUsers.length; i++) {
            String name =  names[(int) (Math.random() * names.length)];
            String secondName = secondNames[(int) (Math.random() * secondNames.length)];
            int age = (int) (Math.random() * 100) + 1;
            arraysUsers[i] = new User(name, secondName, age);
        };
        for (User user : arraysUsers) {
            System.out.println(user);
        }
    }
}
