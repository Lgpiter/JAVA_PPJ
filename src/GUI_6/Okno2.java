package GUI_6;



import javax.swing.*;
import java.awt.*;

public class Okno2 extends JFrame {
    public Okno2(){
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        String fontType = Font.SERIF;
        int fontSize = 14;
        int fontStyle = Font.BOLD | Font.ITALIC;

        Font f = new Font(fontType,fontStyle,fontSize);
        jTextArea.setFont(f);

        jTextArea.setForeground(Color.red);
        jTextArea.setBackground(Color.YELLOW);

        add(jScrollPane);

        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
