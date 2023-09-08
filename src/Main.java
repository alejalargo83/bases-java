public class Main {
    public static void main(String[] args) {

        Rectangulo rectanguloUno = new Rectangulo(5,3);
        Triangulo trianguloUno = new Triangulo(6,9);
        Circulo circuloUno = new Circulo(3);

        System.out.println("Area del rectangulo: " + rectanguloUno.calcularArea());
        System.out.println("Area del triangulo: " + trianguloUno.calcularArea());
        System.out.println("Area del circulo: " + circuloUno.calcularArea());

    }
}