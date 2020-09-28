public class BombaAgua{
    public int cantAguaTrans;//litros
    public Turril turrilConectado;
    public TanqueAgua tanqueConectado;
    public BombaAgua(){
        cantAguaTrans=7;
    }
    public BombaAgua(int cantAguaTrans){
        this.cantAguaTrans=cantAguaTrans;
    }
    public void bombear(){
        int cantAguaTurril=turrilConectado.getCantAgua();
        cantAguaTurril=cantAguaTurril-cantAguaTrans;
        turrilConectado.setCantAgua(cantAguaTurril);
        
        int cantAguaTanque=tanqueConectado.getCantAgua();
        cantAguaTanque=cantAguaTanque+cantAguaTrans;
        tanqueConectado.setCantAgua(cantAguaTanque);
    }
    public int cantVecesBombear(){
        int res=210/cantAguaTrans;
        return res;
    }
    public void conectarTurril(Turril turril){
        turrilConectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}
