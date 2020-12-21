import java.util.*;
public class Persona{
    private String nombre;
    private char sexo;
    private ArrayList<Persona> amigos;
    public Persona (String nom, char sexo){
        nombre=nom;
        this.sexo=sexo;
        amigos=new ArrayList();
    }
    public String getNombre(){
        return nombre;
    }
    public char getSexo(){
        return sexo;
    }
    public void agregarAmigo(Persona p){
        amigos.add(p);
    }
    public void mostrarAmigosFemenino(){
        for(Persona pe:amigos){
            if(pe.getSexo()=='F'){
                System.out.println(mostrarDatos());
            }
        }
    }
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\t Sexo: "+sexo;
    }
    public int cantPersMismoNombre(String nom){
        int cont=0;
        for(Persona pe:amigos){
            if(pe.getNombre().equals(nom)){
                cont++;
            }
        }
        return cont;
    }
}
