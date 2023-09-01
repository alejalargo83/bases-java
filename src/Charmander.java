public class Charmander{
    private String nombre = "Charmander";
    private String tipo = "Fuego";
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    private String[] debilidades = {"Agua","Tierra","Roca"};
    private int puntosVida = 100;

    private boolean estaDisponible = true;

    //constructor
    public Charmander(double alturaPokemon,double pesoPokemon, String sexoPokemon,String habilidadPokemon){
        this.altura = alturaPokemon;
        this.peso = pesoPokemon;
        this.sexo = sexoPokemon;
        this.habilidad = habilidadPokemon;
    }

    public Charmander(){

    }

    //Getter y Setter

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public void setDebilidades(String[] debilidades) {
        this.debilidades = debilidades;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    //Metodos adicionales

    public void ataqueMarLLamas(Bulbasaur rival, int dano){
        System.out.println(nombre + "ataca al pokemon" + rival.getNombre() + "y le causa " + dano + "puntos de dano");
        rival.recibirDano(dano);
    }
}
