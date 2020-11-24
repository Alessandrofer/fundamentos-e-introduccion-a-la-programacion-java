public class Mente{
    private Recuerdo[] recuerdos;
    public Mente(int tam){
        recuerdos= new Recuerdo[tam];
    }

    public boolean agregarRec(Recuerdo r){
        boolean res = false;
        for(int i=0;i<recuerdos.length;i++){
            if(recuerdos[i]==null){
                recuerdos[i]=r;
                res=true;
                break;
            }
        }
        return res;
    }
    
    public Recuerdo getRecuerdoLuz(){
        int posMedio=recuerdos.length/2;
        return recuerdos[posMedio];
    }
    public boolean statusLleno(){
        boolean res=true;
        for(int i=0;i<recuerdos.length;i++){
            if(recuerdos[i]==null){
                res=false;
                break;
            }
        }
        return res;
    }
    public void ordenDia(){
        if(statusLleno()){
            for(int i=0;i<recuerdos.length-1;i++){
              for(int j=0;j<recuerdos.length;j++){
                  int dia1=recuerdos[i].getDia();
                  int dia2=recuerdos[j].getDia();
                  if(dia1>dia2){
                      Recuerdo aux=recuerdos[i];
                      recuerdos[i]=recuerdos[j];
                      recuerdos[j]=aux;
                    }
                }
            }
        }
    }
    public void ordenMes(){
        if(statusLleno()){
            for(int i=0;i<recuerdos.length-1;i++){
              for(int j=0;j<recuerdos.length;j++){
                  int dia1=recuerdos[i].getMes();
                  int dia2=recuerdos[j].getMes();
                  if(dia1>dia2){
                      Recuerdo aux=recuerdos[i];
                      recuerdos[i]=recuerdos[j];
                      recuerdos[j]=aux;
                    }
                }
            }
        }
    }
    public void ordenYear(){
        if(statusLleno()){
            for(int i=0;i<recuerdos.length-1;i++){
              for(int j=0;j<recuerdos.length;j++){
                  int dia1=recuerdos[i].getYear();
                  int dia2=recuerdos[j].getYear();
                  if(dia1>dia2){
                      Recuerdo aux=recuerdos[i];
                      recuerdos[i]=recuerdos[j];
                      recuerdos[j]=aux;
                    }
                }
            }
        }
    }
    
}
