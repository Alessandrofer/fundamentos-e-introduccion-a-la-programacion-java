
public class FechaRec
{
    private int dia, mes, year;
    public FechaRec(int dia, int mes, int year){
        this.dia=dia;
        this.mes=mes;
        this.year=year;
        controlarDate();
    }

    public boolean controlarDate(){
        boolean res = false ;
        if(dia<=30 && mes<=12){
            res= true;
        }else{
            dia=0;
            mes=0;
            year=0;
            res=false;
        }
        return res;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getYear(){
        return year;
    }

}
