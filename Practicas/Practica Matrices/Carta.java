public class Carta{
    private String simbCart;
    private int numCart;
    public Carta(int num, String simbolo){
    
        simbCart=simbolo;
        numCart=num;
    }
    public Carta(){
        String [] simbolos= {"Diamante","Trebol","Corazon","Espada"};
        int inPos = (int)(Math.random()*4);
        numCart = (int)(Math.random()*10)+1;
        simbCart= simbolos[inPos];
    }
    public String mostrarDatos(){
        return "("+numCart+","+simbCart+")";
    }
    public String getsimbCart(){
        return simbCart;
    }
    public int getnumCart(){
        return numCart;
    }
}
