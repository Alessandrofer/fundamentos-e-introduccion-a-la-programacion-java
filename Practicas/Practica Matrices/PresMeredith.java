public class PresMeredith{
    private Carta[][] cartas;
    private int acierto,contra,x,y;
    public PresMeredith(Carta[][] cartas){
        this.cartas=cartas;
    }
    
    /*public char develarCasilla(int x, int y) {
        if(tibus[x][y]=='T'){
            tesoroCont++;
        }else{
            tiburon++;
            tesoroCont=0;
        }
        perdioJuego();
        return tibus[x][y]=='B'? 'B':'T';
    }*/
    public void visualizar(){
        for(int i=0;i<cartas.length;i++){
            for(int j=0;j<cartas[i].length;j++){
                Carta aux=cartas[i][j];
                System.out.print(aux.mostrarDatos()+"  ");
            }
            System.out.println();
        }
    }
    
}
