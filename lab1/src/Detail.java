/**
 * Класс деталь
 */
public class Detail {
    Shape shape;
    String material;
    double weight;

    /**
     * @param shape Размер
     * @param material Материал
     * @param weight Вес
     */
    Detail(Shape shape, String material, double weight) {
        this.shape = shape;
        this.material = material;
        this.weight = weight;
    }
}