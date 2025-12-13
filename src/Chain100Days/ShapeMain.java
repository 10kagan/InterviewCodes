package Chain100Days;

public class ShapeMain {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println(circle.area());     // 78.53
        System.out.println(rectangle.area());  // 24.0
    }
}
