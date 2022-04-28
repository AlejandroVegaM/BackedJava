package PracticaHarryPotter;

public class Luna {
    public static void main(String[] args) {
        Luna();
    }
    public static void Luna(){
        Mago Luna = new Mago();

        Luna.setNombre("Luna Lovegood");
        Luna.setCasa("Revenclaw");
        Luna.setGenero("Femenina");
        Luna.setVarita("Roble");
        Luna.setPatronus("Liebre");

        String msg = " Personaje Luna Lovegood";
        msg = msg + "\nNombre: " + Luna.getNombre();
        msg =msg + "\nCasa: " + Luna.getCasa();
        msg = msg + "\nGenero:" + Luna.getGenero();
        msg = msg + "\nVarita: " + Luna.getVarita();
        msg = msg + "\nPatronus:" + Luna.getPatronus();
        System.out.print(msg);
    }
}
