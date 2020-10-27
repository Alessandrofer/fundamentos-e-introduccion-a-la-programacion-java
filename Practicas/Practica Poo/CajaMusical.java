public class CajaMusical {
    private String cancion1,cancion2,cancion3;
    private boolean estado; //true ---> reproduciendo
    private int cancionActual; //0,1,2
    
    public CajaMusical(String c1,String c2,String c3){
        cancion1=c1;
        cancion2=c2;
        cancion3=c3;
        cancionActual=0;
    }
    
    public CajaMusical(){
        cancion1="Linking Park - Iridicent";
        cancion2="Coldplay - Fix You";
        cancion3="Keane - Somewhere Only We Know";
        cancionActual=0;
    }
    
    public String reproducirCancion() {
        String res="";
        if(estado==true){
            //reproduciendo
            res="ya esta reproduciendo";
        }else{
            estado=true; //reproduciendo
            res="le dimos play";
        }
        return res;
    }
    
    public String pausarCancion(){
        String res="";
        if(estado==false){
            //en pausa
            res="ya esta en pausa";
        }else{
            estado=false; //reproduciendo
            res="hemos pausado";
        }
        return res;
    }
    
    public void cambiarCancion(){
        cancionActual=(cancionActual+1)%3;
    }
}
