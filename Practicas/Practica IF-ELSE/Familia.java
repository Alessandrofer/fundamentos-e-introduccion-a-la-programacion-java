public class Familia{
    private int e1, e2, e3;
    private String n1, n2, n3;
    private Hijo h1, h2, h3; 
    public Familia(Hijo h1, Hijo h2, Hijo h3){
        this.h1=h1;
        this.h2=h2;
        this.h3=h3;
    }
        public String hijoMayor(){
        String res="";
        int e1=h1.getEdad();
        int e2=h2.getEdad();
        int e3=h3.getEdad();
        String n1=h1.getNom();
        String n2=h2.getNom();
        String n3=h3.getNom();
        if (e1 > e2) {
            if (e1 > e3) {
                res= n1;                                             
            } else {
                res= n3;     
            }
        } else if (e2 > e3) {
            res= n2;
        } else {
            res= n3;
        }
        return res;
    }

    public String hijoMenor(){
        String res="";
        int e1=h1.getEdad();
        int e2=h2.getEdad();
        int e3=h3.getEdad();
        String n1=h1.getNom();
        String n2=h2.getNom();
        String n3=h3.getNom();
        if (e1 < e2) {
            if (e1 < e3) {
                res= n1;                                             
            } else {
                res= n3;     
            }
        } else if (e2 < e3) {
            res= n2;
        } else {
            res= n3;
        }
        return res;
    }

    public String hijoDelMedio(){
        String res="";
        int e1=h1.getEdad();
        int e2=h2.getEdad();
        int e3=h3.getEdad();
        String n1=h1.getNom();
        String n2=h2.getNom();
        String n3=h3.getNom();
        if (e1>e2 && e1>e3) {
            if (e2>e3) {
                res= n2;                                             
            } else {
                res= n3;     
            }
        } else if (e2>e1 && e2>e3){
            if(e1>e3){
                res= n1;
            }else{
                res= n3;
            }  
        }else{
            if(e2>e1){
                res= n2;
            }else{
                res= n1;
            }
        }
        return res;
    }
}
