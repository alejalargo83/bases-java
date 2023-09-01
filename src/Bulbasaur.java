public class Bulbasaur{
    private String nombre = "Bulbasaur";
    private String tipo = "Espesura";
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    private String[] debilidades = new String[4];
    private int puntosVida = 100;
    private boolean estaDisponible = true;


    public Bulbasaur(){

    }

    public Bulbasaur(double alturaPokemon,double pesoPokemon, String sexoPokemon,String habilidadPokemon){
        this.altura = alturaPokemon;
        this.peso = pesoPokemon;
        this.sexo = sexoPokemon;
        this.habilidad = habilidadPokemon;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades() {
        debilidades[0] = "Fuego";
        debilidades[1] = "Psiquico";
        debilidades[2] = "Volador";
        debilidades[3] = "Hielo";
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    //Metodos adicionales

    public void recibirDano(int dano){
        puntosVida = puntosVida - dano;
    }
}