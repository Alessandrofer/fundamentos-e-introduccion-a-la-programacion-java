public class Digitos{
    private int num;
    public int Digitos(int num){
        int cant=0;
        while(num>0)
	{
	    num=num/10;
	    cant++;
	}
	return cant;
    }
    
}
