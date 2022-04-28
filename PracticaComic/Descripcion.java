public class Descripcion {
    private String narrativa;

    public Descripcion(String narrativa){

        this.narrativa=narrativa;
    }


    public boolean setnarrativa(String narrativa){
        if (!narrativa.isEmpty()){
            this.narrativa=narrativa;
            return true;
        }else
            return false;
    }
    public String showmensaje(){
        return
                "\n " + "Narrativa: " + narrativa + "\n";
    }

}
