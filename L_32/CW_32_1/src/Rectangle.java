public class Rectangle extends Shape {
    private  double sideA;
    private  double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: sides=(%.2f; %.2f) area=#.3f", sideA, sideB, calcArea());
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }
}
