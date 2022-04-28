public class Esc1Part2 extends Descripcion implements Escena1p2{
    public Esc1Part2(String narrativa) {
        super(narrativa);
    }

    @Override
    public void Goku(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.out("Goku: HAAA!!" + "\n");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Humanos(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("Humanos: Satan, satan!!" + "\n");
        s.showImage("Escena1p2.png");
        s.setBounds(200,100,1100,900);

    }
}
