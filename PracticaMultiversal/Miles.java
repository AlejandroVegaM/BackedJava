public class Miles extends Spiderman implements Acciones {

    public Miles(String nombre, String genero, String traje, String pareja, String Universo) {
        super(nombre, genero, traje, pareja, Universo);
    }

    @Override
    public void Poderes(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.showImage("Miles.jpg");
        s.setBounds(200,100,1100,900);


    }

    @Override
    public void PoderesCindy(Screen s) {

    }

    @Override
    public void PoderesStacy(Screen s) {

    }


}
