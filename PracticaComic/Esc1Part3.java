public class Esc1Part3 extends Descripcion implements  Escena1p3{
    public Esc1Part3(String narrativa) {
        super(narrativa);
    }

    @Override
    public void imagen(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.showImage("Escena1p3.png");
        s.setBounds(200,100,1100,900);
    }

    }

