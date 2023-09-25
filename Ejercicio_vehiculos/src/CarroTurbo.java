public class CarroTurbo extends Vehiculo implements CalcularPotencia{
    public static final  int TORQUE=200;
    public CarroTurbo(String marca, String referencia, int cilindraje, String tipoCaja, String color, double revolucionesMinuto) {
        super(marca, referencia, cilindraje, tipoCaja, color, revolucionesMinuto);
    }
    @Override
    public double potencia() {
        double potencia = ((TORQUE * getRevolucionesMinuto()/ 9.6) / 745.7)*1.12;
        return potencia;
    }
}
