import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

     MyFrame() {
        setTitle("Kalkulator by bunzio v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize( 400, 250);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int fwidth = getSize().width;
        int fheight = getSize().height;
        setLocation((width-fwidth)/2,(height-fheight)/2);
        setResizable(false);

        initComponents();

     }
    public  void initComponents() {
         //Utworzenie obiektow
        oknoWynik = new JTextField("0");
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        bDodwanie = new JButton("+");
        bOdejmowanie = new JButton("-");
        bMnozenie = new JButton("*");
        bDzielenie = new JButton("/");
        bPrzecinek = new JButton(",");
        bPlusMinus = new JButton("±");
        //dodanie obiektow do kontenera
        Container kontener = this.getContentPane();
        kontener.add(oknoWynik);
        kontener.add(button0);
        kontener.add(button1);
        kontener.add(button2);
        kontener.add(button3);
        kontener.add(button4);
        kontener.add(button5);
        kontener.add(button6);
        kontener.add(button7);
        kontener.add(button8);
        kontener.add(button9);
        kontener.add(bDodwanie);
        kontener.add(bOdejmowanie);
        kontener.add(bMnozenie);
        kontener.add(bDzielenie);
        kontener.add(bPrzecinek);
        kontener.add(bPlusMinus);
        //Ustawienie pozycji obiektow i ich rozmiarow
        oknoWynik.setBounds(125, 10,250,35);
        button0.setBounds(60,175,50, 25);
        bPlusMinus.setBounds( 5, 175, 50, 25);
        bPrzecinek.setBounds(115,175,50,25);
        button1.setBounds(5, 145, 50, 25);
        button2.setBounds(60, 145, 50, 25);
        button3.setBounds(115, 145, 50, 25);
        button4.setBounds(5, 115, 50, 25);
        button5.setBounds(60, 115, 50, 25);
        button6.setBounds(115, 115, 50, 25);
        button7.setBounds(5, 85, 50, 25);
        button8.setBounds(60, 85, 50, 25);
        button9.setBounds(115, 85, 50, 25);
        //Ustawienie parametrow okna od wynikow
        oknoWynik.setHorizontalAlignment(JTextField.RIGHT);
        oknoWynik.setFont(new Font("System", Font.BOLD,20));
        oknoWynik.setEditable(false);
        oknoWynik.setBackground(Color.white);
    }
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton bDodwanie;
    JButton bOdejmowanie;
    JButton bMnozenie;
    JButton bDzielenie;
    JButton bPrzecinek;
    JButton bPlusMinus;
    JTextField oknoWynik;

}


