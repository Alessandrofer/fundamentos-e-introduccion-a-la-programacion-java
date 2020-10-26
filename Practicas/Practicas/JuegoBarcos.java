public class JuegoBarcos{
    private int x,y, intentos;
    public JuegoBarcos(){
        intentos=3;
        x = (int)(Math.random()*11);
        y = (int)(Math.random()*11);
    }

    public String Jugar(int posX, int posY){
        int distanciaX=Math.abs(x-posX);
        int distanciaY=Math.abs(y-posY);
        String msj =distanciaX <=2?"X esta cerca": "X esta lejos";
        String vicX =distanciaX==x?"ganaste":"";
        String vicY =distanciaY==y?"ganaste":"";
        return distanciaY<=2? msj+vicX+vicY+" Y esta cerca" : msj+vicX+vicY+ "Y esta lejos";
    }
    
    public static int abs(int x){
        return x<0?x*-1:x;
    }

}
