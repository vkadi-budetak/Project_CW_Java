import javax.swing.text.StringContent;

public class Circle extends Shape{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: radius=%.2f area=%.3f", radius, calcArea());
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }
}
