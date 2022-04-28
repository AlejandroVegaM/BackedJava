public class Stacy extends Spiderman implements Acciones{
    public Stacy(String nombre, String genero, String traje, String pareja, String Universo) {
        super(nombre, genero, traje, pareja, Universo);
    }

    @Override
    public void Poderes(Screen s) {

    }

    @Override
    public void PoderesCindy(Screen s) {

    }

    @Override
    public void PoderesStacy(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.showImage("Stacy.jpg");
        s.setBounds(200,100,1100,900);

    }
}
