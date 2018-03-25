import javax.swing.*;

public class buttonActionListener extends MyFrame {

    buttonActionListener() {
        super();
        createButtonActionListener();

    }

    private void buttonAction(JButton buttonName) {
        oText = oknoWynik.getText();
        if (oText.equals("0")) {
            oknoWynik.setText(buttonName.getText());
        } else
            oknoWynik.setText(oknoWynik.getText() + buttonName.getText());
    }

    private void buttonDzialanieAction(JButton buttonName) {
        oText = oknoWynik.getText();
        if (oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                oText.endsWith(")")) {
            oText = oknoWynik.getText();
        } else {
            if (oText.equals("0")) {
                oknoWynik.setText("0");
                przecinek = 0;
            } else {
                oknoWynik.setText(oknoWynik.getText() + buttonName.getText());
                przecinek = 0;
            }
        }


    }

    public void createButtonActionListener() {
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

            if (cofnij == 0) {
                oknoWynik.setText("0");
            }

            if (cofnij > 0) {
                StringBuilder back = new StringBuilder(oknoWynik.getText());
                back.deleteCharAt(cofnij);
                oknoWynik.setText(back.toString());
            }

        });
        bDodwanie.addActionListener(evt -> buttonDzialanieAction(bDodwanie));
        bOdejmowanie.addActionListener(evt -> buttonAction(bOdejmowanie));
        bMnozenie.addActionListener(evt -> buttonDzialanieAction(bMnozenie));
        bDzielenie.addActionListener(evt -> buttonDzialanieAction(bDzielenie));
        bXdoN.addActionListener(evt -> {
            oText = oknoWynik.getText();

            if (oText.equals("0")) {
                oknoWynik.setText("poteguj(");
            } else {
                oknoWynik.setText(oText + "poteguj(");
                przecinek = 0;
            }

        });
        bOnawias.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if (oText.equals("0")) {
                oknoWynik.setText("(");
                licz = oknoWynik.getText();
            } else {
                licz = oText + "(";
                oknoWynik.setText(licz);
            }
            przecinek = 0;


        });
        bZnawias.addActionListener(evt -> buttonDzialanieAction(bZnawias));
        bPierwiastek.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if (oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                    oText.endsWith(")")) {
                oText = oknoWynik.getText();
            } else {
                if (oText.equals("0")) {
                    oknoWynik.setText("√(");
                    licz = oknoWynik.getText();
                    przecinek = 0;
                } else {
                    licz = oText + "√(";
                    oknoWynik.setText(licz);
                    przecinek = 0;
                }
            }


        });
        bPrzecinek.addActionListener(evt -> {
            oText = oknoWynik.getText();
            if (oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") || oText.endsWith("/") || oText.endsWith("(") ||
                    oText.endsWith(")")) {
                oText = oknoWynik.getText();
            } else {
                if (przecinek == 0) {

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
            String str10 = str9.toString().replaceAll("pierwiastek", "Math.sqrt");

            StringBuffer str11 = new StringBuffer(str10);
            dane = str11.toString().replaceAll("do", ",");


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
