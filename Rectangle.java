/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length and breadth of the 
rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter 
for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and peramiter of a rectangle and a square*/
	public class Rectangle {
    protected double length;
    protected double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print the area of the rectangle
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    // Method to print the perimeter of the rectangle
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
