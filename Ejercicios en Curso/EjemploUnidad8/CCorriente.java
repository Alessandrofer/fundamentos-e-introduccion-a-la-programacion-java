public class CCorriente extends Cuenta{
    public CCorriente(double saldo){
        super(saldo);
    }
    public String retirar(double monto){
        String res="";
        if(monto<=saldo){
            saldo=saldo-monto;
            res="Transaccion realizada";
        }else{
            res="Operacion no valida, saldo insuficiente";
        }
        return res;
    }
}
