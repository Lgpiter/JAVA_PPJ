package GUI_6;

import javax.swing.*;
import java.awt.*;

public class Okno3 extends JFrame {
    public Okno3(){
        JFrame jFrame = new JFrame("Zadanie3");
        JButton jButton1 =new JButton("Przycisk1");
        JButton jButton2 =new JButton("Przycisk 2");
        JButton jButton3 =new JButton("P3");
        JButton jButton4 =new JButton("P 4");
        JButton jButton5 =new JButton("Duży przycisk o numerze 5");
        JPanel panel = new JPanel();

        /*
        BORDERLAYOUT
        panel.setLayout(new BorderLayout());

        add(panel);

        panel.add(jButton1,BorderLayout.PAGE_START);
        panel.add(jButton2,BorderLayout.LINE_START);
        panel.add(jButton3,BorderLayout.CENTER);
        panel.add(jButton4,BorderLayout.LINE_END);
        panel.add(jButton5,BorderLayout.PAGE_END);

         */

        /*
        FLOWLAYOUT
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jButton3);
        panel.add(jButton4);
        panel.add(jButton5);

         */

        panel.setLayout(new GridLayout(2,3));
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jButton3);
        panel.add(jButton4);
        panel.add(jButton5);

        add(panel);
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
