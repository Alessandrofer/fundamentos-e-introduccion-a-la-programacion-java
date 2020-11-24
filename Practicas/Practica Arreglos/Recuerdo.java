public class Recuerdo{
    private FechaRec fecha;
    private String descrip;
    public Recuerdo(FechaRec fecha, String descrip){
        this.fecha=fecha;
        this.descrip=descrip;
    }
    public int getDia(){
        return fecha.getDia();
    }
    public int getMes(){
        return fecha.getMes();
    }
    public int getYear(){
        return fecha.getYear();
    }
    public FechaRec getFecha(){
        return fecha;
    }
}
