public class TiburonesAsesinos implements JuegoTiburones{
    private  int fila,col;
    private char [][] tibus;
    public TiburonesAsesinos(){
        fila=5; col=5;
        tibus=new char [fila][col];
        for(int i=0;i<tibus.length;i++){
            for(int j=0;j<tibus.length;j++){
                tibus[i][j]= simbGame();
            }
        }
    }
    public char simbGame(){
        char [] simTab= {'T','B'};
        char inPos = (char)(Math.random()*2);
        char tableroTib= simTab[inPos];
        return tableroTib;
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
    public void acumTesoro(){
        
    }
    public char develarCasilla(int x, int y) {
        return x%2==0? 'B':'T';
    }

    public int getFila() {
        return fila;
    }

    public int getCol() {
        return col;
    }

    public boolean ganoJuego() {
        
        return false;
    }

    public boolean perdioJuego() {
        return false;
    }
    public int getTesoro(){
        return 0;
    }
    public void mostrar(){

    }

}
