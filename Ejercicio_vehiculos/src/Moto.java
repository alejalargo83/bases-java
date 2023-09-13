public class Moto extends Vehiculo implements CalcularPotencia{
    public static final  int TORQUE=50;
    public Moto(String marca, String referencia, int cilindraje, String tipoCaja, String color, double revolucionesMinuto) {
        super(marca, referencia, cilindraje, tipoCaja, color, revolucionesMinuto);
    }
    @Override
    public double potencia() {
        double potencia = ((TORQUE * getRevolucionesMinuto()/ 9.8)/745.7);
        return potencia;
    }
}
