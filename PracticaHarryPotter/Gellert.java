package PracticaHarryPotter;

public class Gellert {

    public static void main(String[] args) {
        Gellert();
    }

    public static void Gellert(){
        Mago Gellert = new Mago();

        Gellert.setNombre("Gellert Grindelwald");
        Gellert.setCasa("Slytherin");
        Gellert.setGenero("Masculino");
        Gellert.setVarita("Sauco");
        Gellert.setPatronus("Incorporeo");

        String msg = "Personaje Gellert Grindelwald";
        msg = msg + "\nNombre: " + Gellert.getNombre();
        msg = msg + "\nCasa: " + Gellert.getCasa();
        msg = msg + "\nGenero: " + Gellert.getGenero();
        msg = msg + "\nVarita: " + Gellert.getPatronus();
        System.out.print(msg);

    }
}
