public class Semaforo{
    private int contador;
    public String color(){
        String res;
        switch(contador){
            case 0: res = "Rojo"; break;
            case 1: res = "Verde"; break;
            case 2: res = "Amarillo"; break;
            default: res = "";
        }
        return res;
    }
    public int cambiar(int n){
        contador=(contador+n)%3;
        return contador;
    }
}
