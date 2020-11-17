public class fibonacci{
    private int cant, a=0, b=1, c=0, cont=1;
    public fibonacci(int cant){
        for(cont=1;cont<=cant;cont++)
        {
            a=b;
            b=c;
            c=a+b;
        }
    }
    public int mostrar(){
        return c;
    }
}
