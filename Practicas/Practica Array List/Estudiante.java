public class Estudiante{
    private String nombEst, apellEst;
    private int n1, n2, promedio;
    public Estudiante(String nombre, String apellido){
        nombEst=nombre;
        apellEst=apellido;
    }
    
    public String getNombEst(){
        return nombEst;
    }

    public String getApellEst(){
        return apellEst;
    }
    public int getPromedio(){
        return promedio;
    }

    public void addNotas(int nota1, int nota2){
        n1=nota1;
        n2=nota2;
        nunkMenos();
        promedioNotas();
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

    public void promedioNotas(){
        promedio=(n1+n2)/2;
    }
    public String mostrarDatos(){
        return "Nombre: "+nombEst+"\t Apellido: "+apellEst+"\t Promedio: "+promedio;
    }
}
