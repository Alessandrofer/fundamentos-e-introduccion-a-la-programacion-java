public class PrimerDigito{
    private int num, primer=0;
    private String mensaje;
    public String mostrar(int num){
        String mensaje = String.valueOf(primer);
        if(num<100 || num>=1000){
            mensaje="Ingrese un numero con 3 cifras";
        }else{
            if(num>=100){
                primer=num/100;
                mensaje="El digito es: " + primer;
            }
        }
        return mensaje;
    }
}
