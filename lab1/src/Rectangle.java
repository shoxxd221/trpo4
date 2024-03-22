/**
 * Класс прямоугольник
 */
class Rectangle extends Shape {
    /**
     * Ширина
     */
    private final double width;
    /**
     * Высота
     */
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return Размер(площадь) прямоугольника
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}