public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.printArea();
        rectangle.printPerimeter();

        // Create a Square object
        Square square = new Square(4.0);
        square.printArea();
        square.printPerimeter();
    }
}
