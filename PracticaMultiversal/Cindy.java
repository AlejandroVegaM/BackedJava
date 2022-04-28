public class Cindy extends Spiderman implements Acciones{


    public Cindy(String nombre, String genero, String traje, String pareja, String Universo) {
        super(nombre, genero, traje, pareja, Universo);
    }


    @Override
    public void Poderes(Screen s) {

    }

    @Override
    public void PoderesCindy(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.showImage("Cindy.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void PoderesStacy(Screen s) {

    }
}
