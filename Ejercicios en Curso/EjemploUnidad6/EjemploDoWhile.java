public class EjemploDoWhile{
    public int calcularGastoEnergia(int perimetro, int cantVueltas){
        int res=0;
        int factor=1;
        int cont=0;
        do{
            res=res+(perimetro*factor);
            factor++;
            cont++;
        }while(cont<cantVueltas);
        return res;
    }
}
