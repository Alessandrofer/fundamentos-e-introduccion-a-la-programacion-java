import java.util.*;
public class ListaEstudiante{
    private ArrayList<Estudiante> estudiantes;
     public ListaEstudiante(){
        estudiantes=new ArrayList();
    }
    public void addEstudiante(Estudiante e){
        estudiantes.add(e);
    }
    public void estAprobados(){
        for(Estudiante es:estudiantes){
            if(es.getPromedio()>=51){
                System.out.println(es.mostrarDatos());
            }
        }
    }
    public void estReprobados(){
        for(Estudiante es:estudiantes){
            if(es.getPromedio()<51){
                System.out.println(es.mostrarDatos());
            }
        }
    }
    public void estEstancia(){
        for(Estudiante es:estudiantes){
            if(es.getPromedio()>=26){
                System.out.println(es.mostrarDatos());
            }
        }
    }
}
