import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Detail> details = new ArrayList<>();
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(4.5, 1.2);
        Rectangle rectangle = new Rectangle(5.1, 2.5);
        details.add(new Detail(circle, "steel", 1.5));
        details.add(new Detail(triangle, "wood", 0.7));
        details.add(new Detail(circle, "plastic", 0.3));
        details.add(new Detail(circle, "bronze", 2.0));
        details.add(new Detail(circle, "plastic", 3.2));
        details.add(new Detail(triangle, "bronze", 15.2));
        details.add(new Detail(rectangle, "aluminium", 7.3));
        details.add(new Detail(triangle, "uran", 11.1));
        details.add(new Detail(circle, "gold", 10.1));
        details.add(new Detail(triangle, "glass", 2.0));


        Map<Shape, Double> weightByShape = new HashMap<>();
        Map<Shape, Integer> countOfShapes = new HashMap<>();

        for (Detail detail : details) {
            weightByShape.put(detail.shape, weightByShape.getOrDefault(detail.shape, 0.0) + detail.weight);
            countOfShapes.put(detail.shape, countOfShapes.getOrDefault(detail.shape, 0) + 1);
        }

        System.out.println("Общий вес деталей каждой формы: " + weightByShape);
        System.out.println("Количество деталей: " + details.size());

        for (Map.Entry<Shape, Integer> entry : countOfShapes.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println("Ключ элемента со значением 1: " + entry.getKey());
                break;
            }
        }

    }
}
