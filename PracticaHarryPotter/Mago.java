package PracticaHarryPotter;

public class Mago {
    //Caracteristicas Escenciales en comun para un mago
    public String Nombre;
    public String Casa;
    public String Patronus;
    public String Genero;
    public String Varita;
    public String Boggart;
    public String Especie;

    public Mago(){
        this.Nombre = Nombre;
        this.Casa = Casa;
        this.Patronus = Patronus;
        this.Genero = Genero;
        this.Varita = Varita;
        this.Boggart = Boggart;
        this.Especie = Especie;

    }



    public String getNombre() { return Nombre; }
    public String getCasa(){ return Casa; }
    public String getPatronus(){ return Patronus; }
    public String getGenero(){ return Genero; }
    public String getVarita() { return Varita; }
    public String getBoggart() { return Boggart; }
    public String getEspecie() {return  Especie;}

//Validando datos
    public boolean setNombre(String Nombre){
        if(!Nombre.isEmpty()){
            this.Nombre= Nombre;
            return true;

        }else
            return false;
    }
    public boolean setCasa(String Casa){
        if (!Casa.isEmpty()){
            this.Casa =Casa;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String Patronus){
        if (!Patronus.isEmpty()){
            this.Patronus=Patronus;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String Genero){
        if (!Genero.isEmpty()){
            this.Genero= Genero;
            return true;
        }else
            return false;
    }

    public Boolean setVarita(String Varita){
        if (!Varita.isEmpty()){
            this.Varita=Varita;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String Boggart){
        if (!Boggart.isEmpty()){
            this.Boggart= Boggart;
            return true;
        }else
            return false;
    }

    public boolean setEspecie(String Especie){
        if (!Especie.isEmpty()){
            this.Especie=Especie;
            return true;
        }else
            return false;
    }


}
