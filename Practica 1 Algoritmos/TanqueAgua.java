public class TanqueAgua{
   public double TanqueAgua(){
       int lleno=10;//datos en hrs
       int vacio=15;
       double llenVac=((1.0/lleno)-(1.0/vacio));
       return llenVac;
    }
}
