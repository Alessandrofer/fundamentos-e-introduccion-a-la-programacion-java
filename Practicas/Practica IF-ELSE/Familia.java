public class Familia{
    private int e1, e2, e3;
    private String n1, n2, n3;
    public Familia(String n1,int e1, String n2, int e2, String n3, int e3){
         this.n1=n1;
         this.e1=e1;
         this.n2=n2;
         this.e2=e2;
         this.n3=n3;
         this.e3=e3;
    }
    public String hijoMayor(){
        String res="";
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
        if (e1>e2 && e1>e3) {
            if (e2>e3) {
                res= n2;                                             
            } else {
                res= n2;     
            }
        } else if (e2>e1 && e2>e3){
            if(e1>e3){
                res= n1;
            }else{
            res= n3;
        }  
  }
  return res;
}
}
