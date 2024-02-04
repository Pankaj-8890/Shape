public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (side1 + side2  < side3 || side1 + side3 < side2 || side2 + side3 < side1)
            throw new RuntimeException();

        if (side1 < 0 || side2 < 0 || side3 < 0)
            throw new RuntimeException();
    }

    public double area() {
        double s = this.circumference() / 2;

        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }

    public double circumference() {
        return this.side1 + this.side2 + this.side3;
    }
}