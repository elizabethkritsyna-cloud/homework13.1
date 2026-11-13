public class Main {
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        };
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}