public class Veterinaria{
    private int ganancias[];
    private Gato gatos[];
    private int index;
    public Veterinaria(int tam){
        ganancias = new int [12];
        gatos = new Gato[tam];
        index=0;
    }

    public String busquedaBinaria(double busca){
        ordenarGatosPeso();
        String res="No se encontro al gato";
        int li=0;
        int ls=gatos.length-1;
        int medio=(li+ls)/2;
        boolean bandera=false;
        while(bandera==false && li<=ls){
            Gato actual = gatos[medio];
            double pesoActual = actual.getPeso();
            if(pesoActual==busca){
                bandera=true;
                res=actual.getNombre();
            }else{
                if(pesoActual>busca){
                    ls=medio-1;
                }else{
                    li=medio+1;
                }
                medio=(li+ls)/2;
            }
        }
        return res;
    }

    public void ordenarGatosPeso(){
        for(int i=1;i<=gatos.length;i++){
            for(int j=1;j<=gatos.length-1-i;j++){
                Gato actual = gatos[j];
                double pesoActual = actual.getPeso();
                Gato vecino = gatos[j+1];
                double pesoVecino = vecino.getPeso();
                if(pesoActual>pesoVecino){
                    Gato aux= gatos[j];
                    gatos[j]= gatos[j+1];
                    gatos[j+1]=aux;
                }
            }
        }
    }

    public void burbuja(){
        for(int i=1;i<=ganancias.length;i++){
            for(int j=1;j<=ganancias.length-1-i;j++){
                if(ganancias[j]>ganancias[j+1]){
                    int aux=ganancias[j];
                    ganancias[j]=ganancias[j+1];
                    ganancias[j+1]=aux;
                }
            }
        }
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

    public boolean agregarGatos(Gato nuevo){
        boolean res = false;
        for(int i=0;i<gatos.length && res==false;i++){
            if(gatos[i]==null){
                gatos[i]=nuevo;
                res=true;
            }
        }
        return res;
    }

    public boolean agregarGanancias(int valor){
        boolean res = false;
        for(int i=0;i<ganancias.length && res==false;i++){
            if(ganancias[i]==0){
                ganancias[i]=valor;
                res=true;
            }
        }
        return res;
    }

    public boolean eliminarGato(Gato busca){
        boolean res = false;
        for(int i=0;i<gatos.length && res==false;i++){
            Gato actual = gatos[i];
            if(actual.equals(busca)){
                res = true;
                gatos [i]=null;
            }
        }
        return res;
    }

    public boolean eliminarGanancia(int busca){
        boolean res = false;
        for(int i=0;i<ganancias.length && res==false;i++){
            int actual = ganancias[i];
            if(actual == busca){
                res = true;
                ganancias [i]=0;
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
