public class Somnia{
    private int durabilidad, alcance;
    public Somnia(int dur, int al){
        durabilidad=dur;
        alcance=al;
    }
    public void fusion(Somnia otroSomnia){
        int alcanceOtro=otroSomnia.getAlcance();
        int durabilidadOtro=otroSomnia.getDurabilidad();
        int nuevoAlcance=alcance+alcanceOtro;
        int nuevaDura=durabilidad<durabilidadOtro?durabilidad:durabilidadOtro;
        
        durabilidad=nuevaDura;
        alcance= nuevoAlcance;
    }
    public Somnia fusion2(Somnia otroSomnia){
        int alcanceOtro=otroSomnia.getAlcance();
        int durabilidadOtro=otroSomnia.getDurabilidad();
        int nuevoAlcance=alcance+alcanceOtro;
        int nuevaDura=durabilidad<durabilidadOtro?durabilidad:durabilidadOtro;
        return new Somnia(nuevaDura,nuevoAlcance);
    }
    public int getAlcance(){
        return alcance;
    }   
    public int getDurabilidad(){
        return durabilidad;
    }
}
