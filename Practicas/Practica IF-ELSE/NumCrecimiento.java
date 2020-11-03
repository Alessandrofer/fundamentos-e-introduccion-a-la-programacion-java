public class NumCrecimiento{
    private int num, a, b, c;
    private String res;
    public NumCrecimiento(int num){
        if(num>=100){
            a=num/100;
            b=(num%100)/10;
            c=num%10;
        }
    }

    public String comparar(){
        if(a<=b && b<=c){
            res="Numero en crecimiento";
        }else{
            res="No es numero en crecimiento";
        }
        return res;
    }
}
