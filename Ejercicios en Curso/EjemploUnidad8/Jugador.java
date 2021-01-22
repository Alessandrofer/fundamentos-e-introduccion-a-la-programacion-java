public class Jugador{
   private String nombre;
   protected int ptsSalud, ptsDanio, velMovimiento;
   protected int posX, posY;
   protected char ficha;
   public Jugador(String nom, int ptsS, int ptsD, int vel, int x, int y){
       nombre=nom;
       ptsSalud=ptsS;
       ptsDanio=ptsD;
       velMovimiento=vel;
       posX=x;
       posY=y;
       ficha=nombre.charAt(0);//extrae primer caracter de la cadena
    }
   public void caminar(){
       posY+=velMovimiento;//posY=posY+velMovimiento;
    }
   public char getFicha(){
       return ficha;
    }
   public int getPosY(){
       return posY;
    }
   public int getPosX(){
       return posX;
    }
   public String getNombre(){
       return nombre;
    }
   public int getPtsSalud(){
       return ptsSalud;
    }
   public int getPtsDanio(){
       return ptsDanio;
    }
   public int getVelMovimiento(){
       return velMovimiento;
    }
}
