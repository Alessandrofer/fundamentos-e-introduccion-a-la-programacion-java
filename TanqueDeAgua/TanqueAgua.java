public class TanqueAgua{
   public int TanqueAgua(){
       int lleno=10;//datos en hrs
       int vacio=15;
       int llenVac=((1/lleno)-(1/vacio));
       return llenVac;
    }
}
