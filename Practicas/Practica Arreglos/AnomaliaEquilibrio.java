public class AnomaliaEquilibrio{
    public int equilibrio[];
    public AnomaliaEquilibrio(){
        equilibrio = new int [10];
    }
    public AnomaliaEquilibrio(int [] x){
        equilibrio = x;
    }

    public boolean agregarNumeros(int valor){
        boolean res = false;   
        for(int i=0;i<equilibrio.length && res==false;i++){
            if(equilibrio[i]==0){
                equilibrio[i]=valor;
                res=true;
            }
        }
        return res;
    }

    private int suma(int inicio, int fin){
        int sum=0, suma=0;  
        for(int i=inicio;i<=fin;i++){
            sum+=equilibrio[i];
        }
        return sum;
    }

    public String buscarNumDese(){
        String res="";
        int li=0,ls=equilibrio.length-1,me=(li+ls)/2;
        while(li!=ls){
            int sumIz= suma(li,me);
            int sumDe= suma(me+1,ls);
            if(sumIz==sumDe){
              res="No hay Desequilibrio";
              break;
            }else{
                if(sumIz>sumDe){
                    ls=me;
                    me=(li+ls)/2;
                }else{
                    li=me+1;
                    me=(li+ls)/2;
                    
                }
                System.out.println("Li "+li+ " ls "+ls);
                res=equilibrio[li]+"";
            }
        }
        return res;
    }
}
