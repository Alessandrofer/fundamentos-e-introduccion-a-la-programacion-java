public class CuadradoPerfecto{
    private int Digitos(int num){
        int cant=0;
        while(num>0)
	{
	    num=num/10;
	    cant++;
	}
	return cant;
    }
    public void Calcular(int num){
        int cant=Digitos(num);        
        int potenA=(int)Math.pow(10,cant-1);
        int cont=0;
        while(cont<cant){
            int cuadrado=num%potenA;
            int cuadrado2=num/potenA;
            num=cuadrado*10+cuadrado2;
            System.out.println(num);
            cont++;
        }
    }
}
