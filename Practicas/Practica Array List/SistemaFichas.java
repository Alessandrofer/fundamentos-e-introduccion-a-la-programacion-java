import java.util.ArrayList;
public class SistemaFichas{
    private ArrayList<Ficha> fichasAtender, fichasAtendidas;
    private int cont;
    public SistemaFichas(){
        fichasAtender= new ArrayList();
        fichasAtendidas= new ArrayList();
        cont=0;
    }
    
    public String generarFicha(){
        cont++;
        Ficha f= new Ficha(cont);
        fichasAtender.add(f);
        return f.getId();
    }
    
    public String atenderFicha(int seg){
        String res="";
        try{
            Thread.sleep(seg*1000);
        }catch(Exception e){
            System.out.println("xdd");
        }
        
        if(!fichasAtender.isEmpty()){
            Ficha f= fichasAtender.remove(0);
            fichasAtendidas.add(f);
            res=f.getId();
        }
        return res;
    }
    
    public void mostrarFichasAtendidas(){
        for(Ficha f : fichasAtendidas){
            System.out.println(f.getId());
        }
    }
    
}
