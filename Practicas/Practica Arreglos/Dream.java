public class Dream{
    private String nombre, descripcion;
    public Dream(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public boolean equals(Dream otro){
        return nombre.equals(otro.getNombre()) && descripcion.equals(otro.getDescripcion());
    }
}
