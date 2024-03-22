/**
 * Класс круг
 */
class Circle extends Shape {
    /**
     * Радиус
     */
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return Размер(площадь) фигуры
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}