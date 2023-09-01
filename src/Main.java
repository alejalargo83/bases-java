public class Main {
    public static void main(String[] args) {

        Charmander charmanderUno = new Charmander(0.6,8.5,"Macho","Mar llamas");

        //Bulbasaur bulbasaurUno = new Bulbasaur(0.7,8.5,"Macho","Espesura");
        Bulbasaur bulbasaurDos = new Bulbasaur();

        bulbasaurDos.setAltura(0.7);
        bulbasaurDos.setPeso(6.9);
        bulbasaurDos.setSexo("Macho");
        bulbasaurDos.setHabilidad("Espesura");
        bulbasaurDos.setDebilidades();

        charmanderUno.ataqueMarLLamas(bulbasaurDos,50);

        System.out.println("Los puntos de vida restantes son: ");
        System.out.println(bulbasaurDos.getPuntosVida());
    }
}