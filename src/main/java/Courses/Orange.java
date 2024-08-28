package Courses;

public class Orange extends Fruit{
    int peelThickness;
    int numberOfSlices;

    @Override
    public String toString() {
        return String.format("Orange{" +
                "peelThickness=%d" +
                ", numberOfSlices=%d" +
                ", sort='%s'" +
                ", weight=%d" +
                '}',
                peelThickness,
                numberOfSlices,
                sort,
                weight);
    }

    public Orange(int weight, String sort, int peelThickness, int numberOfSlices) {
        super(weight, sort);
        this.peelThickness = peelThickness;
        this.numberOfSlices = numberOfSlices;
    }
}
