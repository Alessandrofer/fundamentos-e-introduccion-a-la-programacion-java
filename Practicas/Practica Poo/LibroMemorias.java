public class LibroMemorias{
    private String tarea;
    private int conTareas=1;
    public LibroMemorias(String tarea){
        this.tarea = tarea;
    }
    
    public String getTarea(){
        return tarea;
    }
    public void setTarea(String actual){
        tarea=actual;
        conTareas++;
        System.out.println("Nueva tarea asignada");
    }
}
