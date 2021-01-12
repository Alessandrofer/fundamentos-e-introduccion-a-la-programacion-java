import java.util.*;
public class Amigo{
    private String nombre;
    private char sexo;
    private int edad;
    private ArrayList<Amigo> amigos;
    public Amigo (String nom, char sexo, int edad){
        nombre=nom;
        this.sexo=sexo;
        this.edad=edad;
        amigos=new ArrayList();
    }
    public String getNombre(){
        return nombre;
    }
    public char getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public void agregarAmigo(Amigo p){
        amigos.add(p);
    }
    public void mostrarAmigosComun(){
        for(Amigo pe:amigos){
            if(pe.getNombre().equals(pe.getNombre())){
                System.out.println(mostrarDatos());
            }
        }
    }
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\t Sexo: "+sexo+"\t Edad: "+edad;
    }
    
}
