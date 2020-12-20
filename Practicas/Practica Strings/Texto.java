public class Texto{
    public String [] parts;
    public int contPala;
    public char prueB;
    private static String palabraSep(String frase){
        frase=frase+" ";
        String palabra="";
        for(int i=0;i<frase.length();i++){
            char uniPal=frase.charAt(i);
            if(uniPal!='.' && uniPal!=','){
                palabra=palabra+uniPal;
            }
        }
        return palabra;
    }
    public static String [] separaText(String mensaje){
        String auxMens=palabraSep(mensaje);
        return auxMens.split(" ");
    }
}

