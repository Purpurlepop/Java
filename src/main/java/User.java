public class User {
    int id;
    String firstName;
    String secondName;
    int age;

    public static int createId () {
        int end = 1000;
        return (int) (Math.random() * end);
    }


    public User(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.id = createId();
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
