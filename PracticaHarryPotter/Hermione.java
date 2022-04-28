package PracticaHarryPotter;

public class Hermione {
    public static void main(String[] args) {
        Hermione();
    }
    public static void Hermione (){
        Mago Hermione = new Mago();

        Hermione.setNombre("Hermione Granger");
        Hermione.setCasa("Gryffindor");
        Hermione.setGenero("Fenemino");
        Hermione.setVarita("Nervio de Corazon de Dragon");
        Hermione.setBoggart("La profesora McGonagall");
        Hermione.setPatronus("Nutria");

        String msg = "Personaje Hermione Granger";
        msg= msg + "\nNombre: " + Hermione.getNombre();
        msg = msg +"\nCasa: " + Hermione.getCasa();
        msg = msg + "\nGenero: " + Hermione.getGenero();
        msg = msg + "\nVarita: " + Hermione.getVarita();
        msg = msg + "\nBoggart: " + Hermione.getBoggart();
        msg = msg + "\nPatronus: " + Hermione.getPatronus();
        System.out.print(msg);
    }
}
