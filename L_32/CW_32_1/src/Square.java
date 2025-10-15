public class Square extends Shape{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString(){
        return String.format("Square: side=%.2f area=%3f", side, calcArea());
    }


    @Override
    public double calcArea() {
        return side*side;
    }
}
