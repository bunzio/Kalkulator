import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

     MyFrame() {
        setTitle("Kalkulator by bunzio v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize( 500, 450);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int fwidth = getSize().width;
        int fheight = getSize().height;
        setLocation((width-fwidth)/2,(height-fheight)/2);

        setVisible(true);
        setLayout(new FlowLayout());
        setResizable(false);


    }
}


