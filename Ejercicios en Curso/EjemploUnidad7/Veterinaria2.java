public class Veterinaria2{
    private int ganancias[];
    private int index;
    public Veterinaria2(){
        ganancias = new int [12];
        index=0;
    }   
    public boolean agregarElemento(int valor){
        boolean res = false;
        if(index<ganancias.length){
            ganancias[index]=valor;
            index++;
            res=true;
        }
        return res;
    }
    public boolean agregarElemento2(int valor){
        boolean res = false;
        for(int i=0;i<ganancias.length && res==false;i++){
            if(ganancias[i]==0){
                ganancias[i]=valor;
                res=true;
            }
        }
        return res;
    }
    public boolean eliminarElemento(int busca){
        boolean res = false;
        for(int i=0;i<ganancias.length && res==false;i++){
            int actual = ganancias[i];
            if(actual == busca){
                res = true;
                ganancias [i]=0;
                reordenar(i);
            }
        }
        return res;
    }
    private void reordenar(int ini){
        for(int i=0; i<index;i++){
            ganancias[i]=ganancias[i+1];
        }
        index--;
    }
}