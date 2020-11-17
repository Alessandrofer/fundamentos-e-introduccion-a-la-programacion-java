public class FactorialNum{
    private int fact=1, cont=1, num;
    private String res;
    public String calcularFactorial(int num){
        if(num>0)
	{
            while(cont<=num)
                {
                    fact=fact*cont;
                    cont++;
                }
            res=""+fact;
	    
	}
        else
            {
              res="El factorial de numeros negativos no existe "; 
            }
        return res;  
    }
    
}
