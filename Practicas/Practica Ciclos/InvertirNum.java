public class InvertirNum{
    private int num, invertido=0, resto;
    public int invertir(int num){
        while(num>0){
            resto=num%10;
            invertido=invertido*10+resto;
            num/=10;
        }
        return invertido;
    }
}


