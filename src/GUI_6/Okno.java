package GUI_6;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {
    public Okno(){
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                int width = getWidth() - 1;
                int height = getHeight() - 1;

                g.drawLine(0,0,width,height);
                g.drawLine(0,height,width,0);
            }
        };

        add(panel);
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
