public abstract class Vehiculo {
    private String marca;
    private String referencia;
    private int cilindraje;
    private String tipoCaja;
    private String color;
    private double revolucionesMinuto;

    public Vehiculo(String marca, String referencia, int cilindraje, String tipoCaja, String color, double revolucionesMinuto) {
        this.marca = marca;
        this.referencia = referencia;
        this.cilindraje = cilindraje;
        this.tipoCaja = tipoCaja;
        this.color = color;
        this.revolucionesMinuto = revolucionesMinuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRevolucionesMinuto() {
        return revolucionesMinuto;
    }

    public void setRevolucionesMinuto(double revolucionesMinuto) {
        this.revolucionesMinuto = revolucionesMinuto;
    }

    public abstract double potencia();
}
