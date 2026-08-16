public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 6, 4);

        System.out.println("Circle:");
        System.out.println("Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.calculatePerimeter()));

        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}