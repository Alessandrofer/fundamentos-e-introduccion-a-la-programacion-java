public class TiburonesAsesinos implements JuegoTiburones{
    private int fila,col,tiburon, tesoroCont, tesEncon;
    private char [][] tibus;
    public TiburonesAsesinos(){
        fila=5; col=5;
        tibus=new char [fila][col];
        for(int i=0;i<tibus.length;i++){
            for(int j=0;j<tibus.length;j++){
                tibus[i][j]= 'T';
            }
        }
        addTib();
    }
    public void addTib(){
        int tiburones=3;
        while(tiburones>0){
            int x = (int)(Math.random()*4);
            int y = (int)(Math.random()*4);
            if(tibus[x][y]=='T'){
                tibus[x][y]='B';
                tiburones--;
            }
        }
 
    }
    public void visualizar(){
        for(int i=0;i<tibus.length;i++){
            for(int j=0;j<tibus[i].length;j++){
                char aux= tibus[i][j];
                System.out.print(aux+"  ");
            }
            System.out.println();
        }
    }
  
    public char develarCasilla(int x, int y) {
        if(tibus[x][y]=='T'){
            tesoroCont++;
            tesEncon++;
        }else{
            tiburon++;
            tesoroCont=0;
        }
        perdioJuego();
        return tibus[x][y];
    }

    public int getFila() {
        return fila;
    }

    public int getCol() {
        return col;
    }

    public boolean ganoJuego() {
        boolean res= false;
        if(tesEncon==(fila*col)-3){
            res=true;
        }
        return res;
    }

    public boolean perdioJuego() {
        boolean res = false;
        if(tiburon==3){
            System.out.println("GAME OVER");
            res= true;
        }else{
            System.out.println("Sigue Buscando - con cuidado");
            res=false;
        }
        return res;
    }
    public int getTesoro(){
        int tesoro=tesoroCont*50;
        return tesoro;
    }

}
