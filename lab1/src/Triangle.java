/**
 * Класс треугольник
 */
class Triangle extends Shape {
    /**
     * Основание
     */
    private final double base;
    /**
     * Высота
     */
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * @return Размер(площадь) треугольника
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }


    @Override
    public String toString() {
        return "Triangle";
    }
}