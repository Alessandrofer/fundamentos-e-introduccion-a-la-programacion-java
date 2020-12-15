import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class BotonPro extends JButton implements ActionListener {
    private int x,y;
    private Ventana ventana;
    File xd;
    public BotonPro(int x, int y,Ventana ventana){
        this.x=x;
        this.y=y;
        this.ventana=ventana;
        xd= new File("");
        setIcon(new ImageIcon(xd.getAbsolutePath()+ "/img/img-mar.jpg"));
        //setBackground(Color.cyan);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ventana.getCasilla(x,y)=='B'){
            System.out.println("este es un tiburon");
            setIcon(new ImageIcon(xd.getAbsolutePath()+"/img/tiburon.png"));
        }else{
            System.out.println("es un tesoro");
            setIcon(new ImageIcon(xd.getAbsolutePath()+"/img/img-tesoro.jpg"));
        }
        setEnabled(false);

        if(ventana.perdioJuego()){
            JOptionPane.showMessageDialog(null,"PERDISTE!!");
            System.exit(0);
        }
        if(ventana.ganoJuego()){
            JOptionPane.showMessageDialog(null,"GANASTE!!");
        }
        System.out.println("dimensiones :"+x+" - "+y);

    }
}
