public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

        if (length < 0 || width < 0)
            throw new RuntimeException();
    }

    public double area() {
        return length * width;
    }

    public double circumference() {
        return 2 * (length + width);
    }
}
