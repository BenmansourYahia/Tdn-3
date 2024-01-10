package exercice6;
public class TestFigure {
    public static void main(String[] args) {
        Figure disque = new Disque(new Point(4,2), 5, "MonDisque");
        Figure rectangle = new Rectangle(10, 5, "MonRectangle");

        System.out.println(disque);
        System.out.println(rectangle);
    }
}

