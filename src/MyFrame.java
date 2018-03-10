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
        setResizable(false);


        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        getContentPane().add(panel1, BorderLayout.AFTER_LAST_LINE);
        getContentPane().add(panel2, BorderLayout.AFTER_LAST_LINE);
        getContentPane().add(panel3, BorderLayout.AFTER_LAST_LINE);
        getContentPane().add(panel4, BorderLayout.PAGE_END);

        JButton  button0= new JButton("0");
        JButton  button1= new JButton("1");
        JButton  button2= new JButton("2");
        JButton  button3= new JButton("3");
        JButton  button4= new JButton("4");
        JButton  button5= new JButton("5");
        JButton  button6= new JButton("6");
        JButton  button7= new JButton("7");
        JButton  button8= new JButton("8");
        JButton  button9= new JButton("9");

        panel4.add(button0);
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);



    }
}


