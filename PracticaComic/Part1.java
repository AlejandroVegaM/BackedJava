public class Part1 extends  Descripcion implements Escena1{

    public Part1(String descripcion) {
        super(descripcion);
    }
    @Override
    public void Goku(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showmensaje(),"Helvetica",30,Colors.red);
        s.out("Goku: Diablos!!" + "\n");
        s.showImage("Escena1p1.png");
        s.setBounds(200,100,1100,900);
    }
}
