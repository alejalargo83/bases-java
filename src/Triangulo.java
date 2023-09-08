public class Triangulo extends Figuras implements Operaciones{

    public Triangulo(double horizontal, double vertical) {
        super(horizontal, vertical);
    }

    @Override
    public double calcularArea() {
        double area = (getHorizontal() * getVertical()) / 2;
        return area;
    }
}
