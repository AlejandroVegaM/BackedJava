public class Spiderman {

    private String nombre;
    private String genero;
    private String traje;
    private String pareja;
    private String Universo;


    public Spiderman(String nombre,String genero,String traje,String pareja, String Universo){
        this.nombre= nombre;
        this.genero=genero;
        this.traje=traje;
        this.pareja = pareja;
        this.Universo= Universo;
    }

    public String getnombre() { return nombre; }
    public String getgenero(){ return genero;}
    public String gettraje(){ return traje;}
    public String getpareja(){ return pareja;}
    public String getUniverso(){ return Universo;}

    public boolean setnombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre= nombre;
            return true;
        }else
            return false;
    }

    public boolean setgenero(String genero){
        if (!genero.isEmpty()){
            this.genero= genero;
            return true;
        }else
            return false;
    }

    public boolean settraje(String traje){
        if (!traje.isEmpty()){
            this.traje= traje;
            return true;
        }else
            return false;
    }

    public boolean setpareja(String pareja){
        if (!pareja.isEmpty()){
            this.pareja= pareja;
            return true;
        }else
            return false;
    }

    public boolean setUniverso(String Universo){
        if (!Universo.isEmpty()){
            this.Universo= Universo;
            return true;
        }else
            return false;
    }



    public String showmensaje(){
        return
                "\n" + "Nombre Real: " + nombre + "\n" + "Genero: " + genero + "\n" + "Traje: " + traje + "\n" + "Pareja: " + pareja +
                        "\n " + "Del Universo: " + Universo + "\n";
    }

}
