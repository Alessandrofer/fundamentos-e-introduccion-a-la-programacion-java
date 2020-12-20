public class AutoCorrector{
    public String corregirMayus(String nombreCompleto){
        String [] arrayNombres = Texto.separaText(nombreCompleto);
        String palModif="";
        for(int i=0;i<arrayNombres.length;i++){
            palModif+=corregirPal(arrayNombres[i])+" ";
        }
        return palModif;
    }

    public String corregirPal(String palabra){
        String t=palabra.charAt(0)+"";
        t=t.toUpperCase();
        String m=palabra.substring(1);
        m=m.toLowerCase();
        return t+m;
    }

    public String practica(String texto){
        String j=texto.substring(1);
        return j;
    }

}
