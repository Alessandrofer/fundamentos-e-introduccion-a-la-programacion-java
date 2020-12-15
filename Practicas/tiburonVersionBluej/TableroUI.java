import javax.swing.*;
import java.awt.*;

public class TableroUI extends JPanel {
    private int fila,col;
    private Ventana ventana;
    public TableroUI(Ventana ventana){
        this.ventana=ventana;
        fila=ventana.getFila();
        col=ventana.getCol();
        setLayout(new GridLayout(fila,col,2,2));
        crearTablero();
    }
    private void crearTablero(){

        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                add(new BotonPro(i,j,ventana));
            }

        }
    }
}
