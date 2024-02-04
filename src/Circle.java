public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;

        if (radius < 0 )
            throw new RuntimeException();
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}