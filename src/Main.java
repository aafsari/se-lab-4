public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,9);
        Shape square = new Square(5);
        System.out.printf("The rectangle area is %d\n", rectangle.computeArea());
        System.out.printf("The square area is %d\n", square.computeArea());
    }
}