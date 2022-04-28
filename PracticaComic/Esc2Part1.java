public class Esc2Part1 extends Descripcion implements Escena2p1{
    public Esc2Part1(String narrativa) {
        super(narrativa);
    }

    @Override
    public void Imagen(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.showImage("Escena2p1.png");
        s.setBounds(200,100,1100,900);
    }

    }

