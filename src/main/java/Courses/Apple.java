package Courses;

public class Apple extends Fruit{
    boolean treatedWithWax;
    boolean suitableForMakingCider;

    @Override
    public String toString() {
        return String.format("Apple{" +
                "treatedWithWax=%b" +
                ", suitableForMakingCider=%b" +
                ", sort='%s'" +
                ", weight=%d" +
                '}',
                treatedWithWax,
                suitableForMakingCider,
                sort,
                weight);
    }

    public Apple(int weight, String sort, boolean treatedWithWax, boolean suitableForMakingCider) {
        super(weight, sort);
        this.treatedWithWax = treatedWithWax;
        this.suitableForMakingCider = suitableForMakingCider;
    }
}
