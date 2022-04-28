package PracticaMona;

public class GatosGit {
    public static void main(String[] args) {

        OctoBox Box = new OctoBox("Gris","BoxerTocat","Boxeador","Short y Playera");
        Box.display();

        Snowcat Nieve= new Snowcat("Negro","Snowtocat","Esquair","Ropa terminca");
        Nieve.display();

        Grinchtocat Grin = new Grinchtocat("Verde"," Grinchtocat","Sabotear la Navidad","Traje de Santa");
        Grin.display();

        Mummytocat Momia = new Mummytocat("Blanco","Mummytocat","Aterrorizar Gatos","Vendas");
        Momia.display();

        Homercat Homero = new Homercat("Amarillo","Homercat","Beber Cerveza","Pantalon azul y camisa blanca");
        Homero.display();

        Spectrocat fan = new Spectrocat("Trasparente","Spectrocat","Espantar","Desconocido");
        fan.display();


    }
}
