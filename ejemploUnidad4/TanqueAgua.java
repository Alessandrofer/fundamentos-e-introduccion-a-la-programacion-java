public class TanqueAgua{
    public int capacidad, cantAgua;
    
    public TanqueAgua(){
        capacidad=950;
        cantAgua=0;
    }
    
    public int cantTurrilesNecesarios(){
        int res=capacidad/210;
        return res;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantAgua(){
        return cantAgua;
    }
    public void setCapacidad(int nCapacidad){
        capacidad=nCapacidad;
    }
    public void setCantAgua(int nCantAgua){
        cantAgua=nCantAgua;
    }
}
