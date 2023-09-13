public class Main {
    public static void main(String[] args) {
        CarroNormal carroNormalUno = new CarroNormal("clio", "l5",250,"AUTOMATICA", "Rojo", 600);
        CarroTurbo carroTurboUno = new CarroTurbo("Mazda", "p5",200,"MANUAL", "Rojo",  800);
        Moto motoUno = new Moto("FZ", "e5",200,"MANUAl", "Rojo",  550);
        System.out.println("Potencia del carro normal es: " + carroNormalUno.potencia());
        System.out.println("Potencia del carro turbo es: " + carroTurboUno.potencia());
        System.out.println("Potencia de la moto es: " + motoUno.potencia());
    }
}