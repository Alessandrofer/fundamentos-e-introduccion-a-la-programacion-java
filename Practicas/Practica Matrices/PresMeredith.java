public class PresMeredith{
    private Carta[][] cartas;
    private int acierto,contra,x,y;
    public PresMeredith(Carta[][] cartas){
        this.cartas=cartas;
        x = (int)(Math.random()*11);
        y = (int)(Math.random()*11);
    }
    
    /*public String Jugar(int posX, int posY){
        int distanciaX=Math.abs(x-posX);
        int distanciaY=Math.abs(y-posY);
        return 
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
    public static int abs(int x){
        return x<0?x*-1:x;
    }
}
