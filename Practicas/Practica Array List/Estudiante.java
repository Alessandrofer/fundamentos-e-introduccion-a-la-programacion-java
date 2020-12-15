public class Estudiante{
    private String nombEst, apellEst;
    private int n1, n2;
    public void addEstudi(String nombre, String apellido){
        nombEst=nombre;
        apellEst=apellido;
    }
    public void addNotas(int nota1, int nota2){
        n1=nota1;
        n2=nota2;
        nunkMenos();
    }
    public boolean nunkMenos(){
        boolean res=false;
        if(n1>0&&n2>0){
            res= true;
        }else{
            n1=0;
            n2=0;
            res= false;
        }
        return res;
    }

    public String getNombEst(){
        return nombEst;
    }

    public String getApellEst(){
        return apellEst;
    }

    public void promedio(){
        int promedio;
        promedio=(n1+n2)/2;
    }
}
