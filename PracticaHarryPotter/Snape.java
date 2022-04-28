package PracticaHarryPotter;

public class Snape {

    public static void main(String[] args) {
        Snape();
        }

    public static void Snape(){
        Mago Snape = new Mago();

        Snape.setNombre("Severus Snape");
        Snape.setCasa("Slytherin");
        Snape.setGenero("Masculino");
        Snape.setVarita("Madera");
        Snape.setBoggart("Lord Voldemort");
        Snape.setPatronus("Cierva");

        String msg = " Personaje Severus Snape";
        msg = msg + "\nNombre: " + Snape.getNombre();
        msg = msg + "\nCasa: " + Snape.getCasa();
        msg = msg + "\nGenero: " + Snape.getGenero();
        msg = msg + "\nVarita: " + Snape.getVarita();
        msg =msg + "\nBoggart: "+ Snape.getBoggart();
        msg = msg+ "\nPatronus: "+ Snape.getPatronus();
        System.out.print(msg);
    }

}




