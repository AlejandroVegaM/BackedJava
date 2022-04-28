package PracticaMona;

public class Grinchtocat extends Mona{

    Grinchtocat(String color, String Nombre, String Ocupacion, String atuendo) {
        super(color, Nombre, Ocupacion, atuendo);
    }
    // Metodo display

    void display(){
        System.out.println("\n" + " El color del gato es: " + color + "\n"+ " El Nombre del Gato es: " + Nombre
                +"\n" + "Su ocupacion o actividad es: "+ Ocupacion+ "\n"+ " Su atuendo es: " + atuendo+ "\n");
    }
}
