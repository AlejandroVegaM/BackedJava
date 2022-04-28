package PracticaMona;

public class Homercat extends Mona{

    Homercat(String color, String Nombre, String Ocupacion, String atuendo) {
        super(color, Nombre, Ocupacion, atuendo);
    }

    void display(){
        System.out.println("\n" + " El color del gato es: " + color + "\n"+ " El Nombre del Gato es: " + Nombre
                +"\n"+ "Su ocupacion o actividad es: "+ Ocupacion+ "\n"+ " Su atuendo es: " + atuendo+ "\n");
    }
}
