public class MaquinaVerificacion{
   public int num;
   public MaquinaVerificacion(int num){
       this.num=num;
    }
   public int calcuUlti(){
       num=num%10;
       return num;
    }  
}
