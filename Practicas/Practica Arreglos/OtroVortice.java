public class OtroVortice{
    public int vortice[];
    public OtroVortice(int [] x){
        vortice = x;
    }

    public String menorMayor(){
        String res="";
        int mayor=0, menor=0;
        for (int i = 0; i < vortice.length; i++) {
            if(vortice [i] > mayor) {
                mayor = vortice[i];
            }
            if(vortice[i]<menor) {
                menor = vortice[i];
            }
        }
        return res=menor+"  "+mayor;
    }
}
