public class CopiaSeguridad{
    public double copiaSeg(){
        int cd=700; //Capacidad de almacen en Megabytes
        int datos=5; 
        int gb=1024;
        double totalDatos=datos*gb;
        double copiar=totalDatos/(cd+0.0);
        return copiar;
        
   }
}
