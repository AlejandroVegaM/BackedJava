package PracticaHarryPotter;

public class Cedric {
    public static void main(String[] args) {
        Cedric();
    }

    public static void Cedric(){
        Mago Cedric = new Mago();

        Cedric.setNombre("Cedric Diggory");
        Cedric.setCasa("Hufflepuff");
        Cedric.setGenero("Masculino");
        Cedric.setVarita("Fresno 30 cm");

        String msg = " Personaje Cedric Diggory";
        msg = msg + "\nNombre: " + Cedric.getNombre();
        msg = msg + "\nCasa: " + Cedric.getCasa();
        msg = msg + "\nGenero: " + Cedric.getGenero();
        msg= msg + "\nVarita:" + Cedric.getVarita();
        System.out.print(msg);
    }
}
