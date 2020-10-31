public class Celebracion{
    private int dia,mes,year;
    public String mes(int dia, int mes, int year){
        String res;
        switch(mes){
            case 1: res = dia +" / Enero / " + year; break;
            case 2: res = dia +" / Febrero / " + year; break;
            case 3: res = dia +" / Marzo / " + year; break;
            case 4: res = dia +" / Abril / " + year; break;
            case 5: res = dia +" / Mayo / " + year; break;
            case 6: res = dia +" / Junio / " + year; break;
            case 7: res = dia +" / Julio / " + year; break;
            case 8: res = dia +" / Agosto / " + year; break;
            case 9: res = dia +" / Septiembre / " + year; break;
            case 10: res = dia +" / Octubre / " + year; break;
            case 11: res = dia +" / Noviembre / " + year; break;
            case 12: res = dia +" / Diciembre / " + year; break;
            default: res ="No existe el mes seleccionado"; break;
        }
        return res;
    }
}
