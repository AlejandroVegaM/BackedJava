public class Historieta {

    public static void main(String[] args) throws InterruptedException {
        PARTE1();
        PARTE1_2();
        PARTE1_3();
        PARTE2_1();

    }
    public static void PARTE1 () throws InterruptedException {
    Screen s = new Screen();
    Part1 p1 = new Part1("Ante un poder Abrumador la tierra estaba en serio" + "\n" +
            "Peligro de ser destruida"+ "\n" +"Por el Guerrero mas Fuerte, majinbu" );


        Runnable dialogo1 = new Runnable() {
            @Override
            public void run() {
                try{
                    p1.Goku(s);
                    Thread.sleep(3000);
                }catch (InterruptedException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        Thread ataqueGoku = new Thread (dialogo1);
        ataqueGoku.start();
        ataqueGoku.join();
    }

    public static void PARTE1_2() throws InterruptedException {
        Screen s= new Screen();
        Esc1Part2 p2 = new Esc1Part2("Pero con la llamada de Satan, consiguieron reunir toda la Energia");

        Runnable dialogo2 = new Runnable() {
            @Override
            public void run() {
                try{
                    p2.Goku(s);
                    p2.Humanos(s);
                    Thread.sleep(30000);
                }catch (InterruptedException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread Esc1p2 = new Thread(dialogo2);
        Esc1p2.start();
        Esc1p2.join();
    }

    public static void PARTE1_3() throws InterruptedException {
        Screen s = new Screen();
        Esc1Part3 p3 = new Esc1Part3("Al Fin goku derroto a Majin bu y la paz volvio a la tierra");

        Runnable dialogo3 = new Runnable() {
            @Override
            public void run() {
                try{
                    p3.imagen(s);
                    Thread.sleep(30000);
                }catch (InterruptedException oie){
                    oie.printStackTrace();
                }
            }
        };
        Thread Esc1p3 = new Thread(dialogo3);
        Esc1p3.start();
        Esc1p3.join();
    }

    public static void PARTE2_1() throws InterruptedException {
        Screen s = new Screen();
        Esc2Part1 p1 = new Esc2Part1("Ha Pasado un tiempo desde aquello...");

        Runnable dialogo4 = new Runnable() {
            @Override
            public void run() {
                try {
                  p1.Imagen(s);
                  Thread.sleep(30000);
                }catch (InterruptedException ioe ){
                    ioe.printStackTrace();
                }
            }
        };
        Thread Esc2p1 = new Thread(dialogo4);
        Esc2p1.start();
        Esc2p1.join();
    }

}
