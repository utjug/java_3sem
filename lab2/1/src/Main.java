public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1, 2,3);
        circle.print();
        circle.move();
        Circle.changeRadius();
        System.out.println(circle.distToOtherCircle());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
    }
}