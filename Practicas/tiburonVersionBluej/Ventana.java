import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private TiburonesAsesinos tibus;
    private JLabel tesoro;
    public Ventana(){
        setTitle("Tiburones asesinos");
        JLabel titulo= new JLabel("Este es el titulo");
        JPanel datosJuego= new JPanel();
        tesoro= new JLabel("Tesoro: 0");
        //datosJuego.add(tesoro);
        tibus= new TiburonesAsesinos();
        TableroUI tablero= new TableroUI(this);
        add(tesoro, BorderLayout.NORTH);
        add(datosJuego,BorderLayout.EAST);
        add(tablero,BorderLayout.CENTER);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public char getCasilla(int x,int y){
        char res=tibus.develarCasilla(x,y);
        tesoro.setText("Tesoro: "+tibus.getTesoro());
        return res;
    }
    public boolean ganoJuego(){
        return tibus.ganoJuego();
    }
    public boolean perdioJuego(){
        return tibus.perdioJuego();
    }
    public int getFila(){
        return tibus.getFila();
    }
    public int getCol(){
        return tibus.getCol();
    }
}
