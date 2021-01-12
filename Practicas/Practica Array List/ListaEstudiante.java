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
        System.out.println("Lista de Estudiantes Aprobados");
        for(Estudiante es:estudiantes){
            if(es.getPromedio()>=51){
                System.out.println(es.mostrarDatos());
            }
        }
    }
    public void estReprobados(){
        System.out.println("Lista de Estudiantes Reprobados");
        for(Estudiante es:estudiantes){
            if(es.getPromedio()<51){
                System.out.println(es.mostrarDatos());
            }
        }
    }
    public void estEstancia(){
        System.out.println("Lista de Estudiantes para Segunda Instancia");
        for(Estudiante es:estudiantes){
            if(es.getPromedio()>=26){
                System.out.println(es.mostrarDatos());
            }
        }
    }
}
