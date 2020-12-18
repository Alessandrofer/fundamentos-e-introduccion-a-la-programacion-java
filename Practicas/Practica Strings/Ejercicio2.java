public class Ejercicio2{
    public void operacion1(String mensaje){
        String [] arrayText = Texto.separaText(mensaje);
        for(int i=0;i<arrayText.length;i++){
            System.out.println(arrayText[i]);
        }
    }
}
