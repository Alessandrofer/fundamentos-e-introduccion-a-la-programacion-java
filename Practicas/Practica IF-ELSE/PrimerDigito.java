public class PrimerDigito{
    private int num, primer=0;
    public PrimerDigito(int num){
        primer=num%10;
    }
    public int mostrar(){
        return primer;
    }
}
