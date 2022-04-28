public class MultiversoAbierto {
    public static void main(String[] args) {
      MilesMorales();
      CindyMoon();
      GwenStacy();
    }

    public static void MilesMorales (){
        Screen s = new Screen();

        Miles miles = new Miles("Miles Gonzalo Morales","Masculino","Negro",
                "Soltero","Tierra 616");
        miles.Poderes(s);
    }

    public static void CindyMoon(){
        Screen s = new Screen();
        Cindy cindy = new Cindy("Cindy Moon","Femenino","Gris","Soltera","616");
        cindy.PoderesCindy(s);
    }

    public static void GwenStacy(){
        Screen s = new Screen();
        Stacy stacy = new Stacy("Gwendolyne Maxine Stacy","Femenino","Blanco","Soltera",
                "65");
        stacy.PoderesStacy(s);
    }




}
