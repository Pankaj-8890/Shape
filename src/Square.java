public class Square implements Shape{
    private final double side;

    public Square(double side) {
        this.side = side;

        if (side < 0 )
            throw new RuntimeException();
    }

    public double area() {
        return this.side*this.side;
    }

    public double circumference() {
        return 4 * this.side;
    }
}