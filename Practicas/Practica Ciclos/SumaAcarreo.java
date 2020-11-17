public class SumaAcarreo{
   private int n1, n2, suma=0, acarr=0, cant=0;
   public SumaAcarreo(int n1,int n2){
       this.n1=n1;
       this.n2=n2;
   }
   public int Acarreos(){
       while(n1>0 || n2>0){
           suma=(n1%10)+(n2%10)+acarr;
           acarr=suma/10;
           cant+=acarr;
           n1/=10;
           n2/=10;
        }
       return cant;
    }
}