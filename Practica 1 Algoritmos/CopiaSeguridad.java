public class CopiaSeguridad{
    public int copiaSeg(){
        int cd=700; //Capacidad de almacen en Megabytes
        int datos=5; 
        int gb=1024;
        int totalDatos=datos*gb;
        int copiar=totalDatos/cd;
        return copiar;
    }
}
