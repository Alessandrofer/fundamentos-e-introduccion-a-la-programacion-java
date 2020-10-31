public class Bisiesto{
    private int year;
    private String res;
    public String Bisiesto(int year){
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            res="El año es Bisiesto";
        }else{
            res="El año no es bisiesto";
        }
        return res;    
    }
}
