
public class Rectangulo extends Figuras implements Operaciones{

    public Rectangulo(double horizontal, double vertical) {
        super(horizontal, vertical);
    }

    @Override
    public double calcularArea() {
        double area = getHorizontal() * getVertical();
        return area;
    }
}
