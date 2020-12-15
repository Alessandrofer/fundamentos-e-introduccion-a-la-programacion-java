public class Texto{
    public String [] parts;
    public int contPala;
    public Texto(){
        contPala=0;  
    }

    public static String[] separaCaracteres(String cadena, String separator){        
        String[] parts = null;
        if(separator.equals(" ")&& separator.equals(",")&& separator.equals(".")){
            parts = cadena.split("//"+separator);       
        }else{
            parts = cadena.split(separator);
        }    
        return parts;
    }
}
// Sean todos, bienvenidos, a este curso, especial,