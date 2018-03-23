import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame  {
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, bDodwanie, bOdejmowanie,
                    bMnozenie, bDzielenie, bPrzecinek, bPlusMinus, bWynik, bKasuj, bCofnij, bOnawias, bZnawias, bPierwiastek,
                    bXdoN, bDo;

    private JTextField oknoWynik;
    private Container kontener = this.getContentPane();
    private String licz, oText;
    private int przecinek = 0;

     MyFrame() {
        setTitle("Kalkulator v1.1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize( 300, 250);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int fwidth = getSize().width;
        int fheight = getSize().height;
        setLocation((width-fwidth)/2,(height-fheight)/2);
        setResizable(false);

        initComponents();
        addToContainer();
        setBounds();
        setOknoWynik();
        ActionListener();
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
        bDzielenie = new JButton("÷");
        bPrzecinek = new JButton(",");
        bPlusMinus = new JButton("±");
        bWynik = new JButton("=");
        bKasuj = new JButton("C");
        bCofnij = new JButton("⇦");
        bOnawias = new JButton("(");
        bZnawias = new JButton(")");
        bPierwiastek = new JButton("√");
        bXdoN = new JButton("X²");
        bDo = new JButton("do");
    }

    public void addToContainer() {
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
            kontener.add(bWynik);
            kontener.add(bKasuj);
            kontener.add(bCofnij);
            kontener.add(bOnawias);
            kontener.add(bZnawias);
            kontener.add(bXdoN);
            kontener.add(bPierwiastek);
            kontener.add(bDo);
            kontener.add(bPlusMinus);
        }

    public void setBounds(){
        oknoWynik.setBounds(15, 10,250,35);
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
        bWynik.setBounds(225, 175, 50,25);
        bWynik.setBackground(Color.lightGray);
        bDodwanie.setBounds(225,145,50,25);
        bDodwanie.setBackground(Color.lightGray);
        bOdejmowanie.setBounds(225,115,50,25);
        bOdejmowanie.setBackground(Color.lightGray);
        bMnozenie.setBounds(225,85,50,25);
        bMnozenie.setBackground(Color.lightGray);
        bDzielenie.setBounds(225,55,50,25);
        bDzielenie.setBackground(Color.lightGray);
        bKasuj.setBounds(5,55,50,25);
        bKasuj.setBackground(Color.lightGray);
        bCofnij.setBounds(60,55,50,25);
        bCofnij.setBackground(Color.lightGray);
        bOnawias.setBounds(115,55,50,25);
        bOnawias.setBackground(Color.lightGray);
        bZnawias.setBounds(170,55,50,25);
        bZnawias.setBackground(Color.lightGray);
        bXdoN.setBounds(170,85,50,25);
        bXdoN.setBackground(Color.lightGray);
        bDo.setBounds(170,115,50,25);
        bPierwiastek.setBackground(Color.lightGray);
        bPierwiastek.setBounds(170,145,50,25);
        bDo.setBackground(Color.lightGray);

    }

    public void setOknoWynik(){
        oknoWynik.setHorizontalAlignment(JTextField.RIGHT);
        oknoWynik.setFont(new Font("System", Font.BOLD,20));
        oknoWynik.setEditable(false);
        oknoWynik.setBackground(Color.white);
        oknoWynik.setText("0");
        oText= "0";
        przecinek = 0;
    }

    private void buttonAction(JButton buttonName){
         oText = oknoWynik.getText();
        if(oText.equals("0")) {
            oknoWynik.setText(buttonName.getText());
        }
        else
            oknoWynik.setText(oknoWynik.getText() + buttonName.getText());
    }

    private void buttonDzialanieAction(JButton buttonName){
        oText = oknoWynik.getText();
        if(oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                oText.endsWith(")") ) {
            oText = oknoWynik.getText();
        }
        else{
            if(oText.equals("0")){
                oknoWynik.setText("0");
                przecinek = 0;
            }
            else{
                oknoWynik.setText(oknoWynik.getText() + buttonName.getText());
                przecinek = 0;
            }
        }



    }
    
    public void ActionListener() {
        button0.addActionListener(evt -> buttonAction(button0));
        button1.addActionListener(evt -> buttonAction(button1));
        button2.addActionListener(evt -> buttonAction(button2));
        button3.addActionListener(evt -> buttonAction(button3));
        button4.addActionListener(evt -> buttonAction(button4));
        button5.addActionListener(evt -> buttonAction(button5));
        button6.addActionListener(evt -> buttonAction(button6));
        button7.addActionListener(evt -> buttonAction(button7));
        button8.addActionListener(evt -> buttonAction(button8));
        button9.addActionListener(evt -> buttonAction(button9));
        bKasuj.addActionListener(evt -> {
            oknoWynik.setText("0");
            licz = "0";
            oText = "0";
            przecinek = 0;
        });
        bCofnij.addActionListener(evt -> {
            int cofnij = oknoWynik.getText().length() - 1;

            if(cofnij == 0) {
                oknoWynik.setText("0");
            }

            if(cofnij > 0)
            {
                StringBuilder back = new StringBuilder(oknoWynik.getText());
                back.deleteCharAt(cofnij);
                oknoWynik.setText(back.toString());
            }

        });
        bDodwanie.addActionListener(evt -> buttonDzialanieAction(bDodwanie));
        bOdejmowanie.addActionListener(evt -> {
            if(oText.equals("0")){
                oknoWynik.setText("-");
                przecinek = 0;
            }
            else{
                oknoWynik.setText(oknoWynik.getText() + bOdejmowanie.getText());
                przecinek = 0;
            }
        });
        bMnozenie.addActionListener(evt -> buttonDzialanieAction(bMnozenie));
        bDzielenie.addActionListener(evt -> buttonDzialanieAction(bDzielenie));
        bXdoN.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if(oText.equals("0")){
                oknoWynik.setText("poteguj(");
            }
            else{
                licz = oText+"poteguj(";
                oknoWynik.setText(licz);
            }
            przecinek = 0;


        });
        bOnawias.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if(oText.equals("0")){
                oknoWynik.setText("(");
                licz = oknoWynik.getText();
            }
            else{
                licz = oText+"(";
                oknoWynik.setText(licz);
            }
            przecinek = 0;


        });
        bZnawias.addActionListener(evt -> buttonDzialanieAction(bZnawias));
        bPierwiastek.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if(oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                    oText.endsWith(")") ) {
                oText = oknoWynik.getText();
            }
            else{
            if(oText.equals("0")){
                oknoWynik.setText("√(");
                licz = oknoWynik.getText();
                przecinek = 0;
            }
            else{
                licz = oText+"√(";
                oknoWynik.setText(licz);
                przecinek = 0;
            }}



        });
        bPrzecinek.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if(oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                    oText.endsWith(")") ){
                oText = oknoWynik.getText();
            }
            else {
                if(przecinek == 0) {

                    if (oText.equals("0")) {
                        oknoWynik.setText("0,");
                        przecinek = 1;
                    } else {
                        oknoWynik.setText(oknoWynik.getText() + bPrzecinek.getText());
                        przecinek = 1;
                    }

            }

            }
            });
        bWynik.addActionListener(evt -> {
            String dane = String.valueOf(oknoWynik.getText());

            StringBuffer str1 = new StringBuffer(dane);
            String str2 = str1.toString().replaceAll(",", ".");

            StringBuffer str3 = new StringBuffer(str2);
            String str4 = str3.toString().replaceAll("poteguj", "Math.pow");

            StringBuffer str5 = new StringBuffer(str4);
            String str6 = str5.toString().replaceAll("√", "Math.sqrt");

            StringBuffer str7 = new StringBuffer(str6);
            String str8 = str7.toString().replaceAll("÷", "/");

            StringBuffer str9 = new StringBuffer(str8);
            dane = str9.toString().replaceAll("do", ",");




            try {
                Wynik.Wynik(dane);
                oknoWynik.setText(Wynik.Wynik(dane));
                if (Wynik.Wynik(dane).equals("Infinity"))
                    oknoWynik.setText("Nie dziel przez 0!");
            } catch (Exception e) {
                oknoWynik.setText("Błąd składni!!");
                e.printStackTrace();
            }

        });
        bDo.addActionListener(evt -> buttonDzialanieAction(bDo));

    }


    }





