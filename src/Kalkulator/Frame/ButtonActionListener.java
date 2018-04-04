package Kalkulator.Frame;

import javax.swing.*;

/**
 * Created by Bunzio on 20.03.2018
 * Contact: bunzeladam@gmail.com
 */


public class ButtonActionListener {

    private String licz, oText;
    private boolean przecinek;

    private MyFrame MyFrame;


    public ButtonActionListener(MyFrame MyFrame) {
        this.MyFrame = MyFrame;
        licz = "0";
        oText = "0";
        przecinek = false;

    }

    public void createButtonActionListener() {
        MyFrame.button0.addActionListener(evt -> buttonAction(MyFrame.button0));
        MyFrame.button1.addActionListener(evt -> buttonAction(MyFrame.button1));
        MyFrame.button2.addActionListener(evt -> buttonAction(MyFrame.button2));
        MyFrame.button3.addActionListener(evt -> buttonAction(MyFrame.button3));
        MyFrame.button4.addActionListener(evt -> buttonAction(MyFrame.button4));
        MyFrame.button5.addActionListener(evt -> buttonAction(MyFrame.button5));
        MyFrame.button6.addActionListener(evt -> buttonAction(MyFrame.button6));
        MyFrame.button7.addActionListener(evt -> buttonAction(MyFrame.button7));
        MyFrame.button8.addActionListener(evt -> buttonAction(MyFrame.button8));
        MyFrame.button9.addActionListener(evt -> buttonAction(MyFrame.button9));
        MyFrame.bKasuj.addActionListener(evt -> buttonKasuj());
        MyFrame.bCofnij.addActionListener(evt -> buttonCofnij());
        MyFrame.bDodwanie.addActionListener(evt -> buttonDzialanieAction(MyFrame.bDodwanie));
        MyFrame.bOdejmowanie.addActionListener(evt -> buttonAction(MyFrame.bOdejmowanie));
        MyFrame.bMnozenie.addActionListener(evt -> buttonDzialanieAction(MyFrame.bMnozenie));
        MyFrame.bDzielenie.addActionListener(evt -> buttonDzialanieAction(MyFrame.bDzielenie));
        MyFrame.bXdoN.addActionListener(evt -> xDoN());
        MyFrame.bOnawias.addActionListener(evt -> buttonOnawias());
        MyFrame.bZnawias.addActionListener(evt -> buttonZnawias());
        MyFrame.bPierwiastek.addActionListener(evt -> buttonPierwiastek());
        MyFrame.bPrzecinek.addActionListener(evt -> przecinek());
        MyFrame.bWynik.addActionListener(evt -> wynik());
        MyFrame.bDo.addActionListener(evt -> buttonDzialanieAction(MyFrame.bDo));
        MyFrame.bModulo.addActionListener(evt -> buttonDzialanieAction(MyFrame.bModulo));
    }

    boolean ifEndsWithDzialanie() {
        oText = MyFrame.oknoWynik.getText();
        if (oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") ||
                oText.endsWith("/") || oText.endsWith("!")) {
            return true;
        } else {
            return false;
        }

    }

    boolean ifEndsWithAllDzialanie() {
        oText = MyFrame.oknoWynik.getText();
        if (oText.endsWith("+") || oText.endsWith("-") || oText.endsWith("*") ||
                oText.endsWith("/") || oText.endsWith("(") || oText.endsWith(")") ||
                oText.endsWith("!")) {
            return true;
        } else {
            return false;
        }
    }

    boolean ifLastNumber() {
        oText = MyFrame.oknoWynik.getText();
        if (oText.endsWith("1") || oText.endsWith("2") || oText.endsWith("3") || oText.endsWith("4") ||
                oText.endsWith("5") || oText.endsWith("6") || oText.endsWith("7") || oText.endsWith("8") ||
                oText.endsWith("9")) {
            return true;

        } else {
            return false;
        }
    }

    void buttonAction(JButton buttonName) {
        oText = MyFrame.oknoWynik.getText();
        if (oText.endsWith("!")) {
            oText = MyFrame.oknoWynik.getText();
        } else {
            if (oText.equals("0")) {
                MyFrame.oknoWynik.setText(buttonName.getText());
            } else
                MyFrame.oknoWynik.setText(MyFrame.oknoWynik.getText() + buttonName.getText());
        }
    }

    void buttonDzialanieAction(JButton buttonName) {
        oText = MyFrame.oknoWynik.getText();
        if (ifEndsWithAllDzialanie()) {

            oText = MyFrame.oknoWynik.getText();
        } else {
            if (oText.equals("0")) {
                MyFrame.oknoWynik.setText("0");
                przecinek = false;
            } else {
                MyFrame.oknoWynik.setText(MyFrame.oknoWynik.getText() + buttonName.getText());
                przecinek = false;
            }
        }


    }

    void buttonCofnij() {
        oText = MyFrame.oknoWynik.getText();
        int cofnij = MyFrame.oknoWynik.getText().length() - 1;
        if (oText.endsWith("!")) {
            oText = MyFrame.oknoWynik.getText();
        } else {
            if (cofnij == 0) {
                MyFrame.oknoWynik.setText("0");
            }

            if (cofnij > 0) {
                StringBuilder back = new StringBuilder(MyFrame.oknoWynik.getText());
                back.deleteCharAt(cofnij);
                MyFrame.oknoWynik.setText(back.toString());
            }
        }
    }

    void buttonKasuj() {
        MyFrame.oknoWynik.setText("0");
        licz = "0";
        oText = "0";
        przecinek = false;
    }

    void buttonOnawias() {
        oText = MyFrame.oknoWynik.getText();
        if (oText.endsWith("!")) {
            oText = MyFrame.oknoWynik.getText();
        } else {
            if (ifLastNumber()) {
                if (oText.equals("0")) {
                    MyFrame.oknoWynik.setText("(");
                    licz = MyFrame.oknoWynik.getText();
                    przecinek = false;
                } else {
                    licz = oText + "*(";
                    MyFrame.oknoWynik.setText(licz);
                    przecinek = false;

                }

            } else {
                if (oText.equals("0")) {
                    MyFrame.oknoWynik.setText("(");
                    licz = MyFrame.oknoWynik.getText();
                    przecinek = false;
                } else {
                    licz = oText + "(";
                    MyFrame.oknoWynik.setText(licz);
                    przecinek = false;
                }
            }
        }
    }

    void buttonZnawias() {
        if (ifEndsWithDzialanie()) {
            oText = MyFrame.oknoWynik.getText();
        } else {
            oText = MyFrame.oknoWynik.getText();
            if (oText.endsWith("!")) {
                oText = MyFrame.oknoWynik.getText();
            } else {
                if (oText.equals("0")) {
                    MyFrame.oknoWynik.setText("0");
                    licz = MyFrame.oknoWynik.getText();
                } else {
                    licz = oText + ")";
                    MyFrame.oknoWynik.setText(licz);
                }
                przecinek = false;
            }
        }
    }


    void buttonPierwiastek() {
        oText = MyFrame.oknoWynik.getText();
        if (ifLastNumber()) {
            if (oText.equals("0")) {
                MyFrame.oknoWynik.setText("√(");
                licz = MyFrame.oknoWynik.getText();
                przecinek = false;
            } else {
                licz = oText + "*√(";
                MyFrame.oknoWynik.setText(licz);
                przecinek = false;
            }

        } else {

            if (oText.equals("0")) {
                MyFrame.oknoWynik.setText("√(");
                licz = MyFrame.oknoWynik.getText();
                przecinek = false;
            } else {
                licz = oText + "√(";
                MyFrame.oknoWynik.setText(licz);
                przecinek = false;
            }

        }


    }

    void wynik() {
        String dane = String.valueOf(MyFrame.oknoWynik.getText());
        oText = MyFrame.oknoWynik.getText();

        if (oText.endsWith("!")) {
            oText = MyFrame.oknoWynik.getText();
        } else {
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
                MyFrame.oknoWynik.setText(Wynik.Wynik(dane));
                if (Wynik.Wynik(dane).equals("Infinity"))
                    MyFrame.oknoWynik.setText("Nie dziel przez 0!");
            } catch (Exception e) {
                MyFrame.oknoWynik.setText("Błąd składni!!");
                e.printStackTrace();
            }
        }
    }

    void xDoN() {
        oText = MyFrame.oknoWynik.getText();
        if (ifLastNumber()) {
            if (oText.equals("0")) {
                MyFrame.oknoWynik.setText("poteguj(");
            } else {
                MyFrame.oknoWynik.setText(oText + "*poteguj(");
                przecinek = false;
            }

        } else {
            if (oText.endsWith("!")) {
                oText = MyFrame.oknoWynik.getText();
            } else {
                if (oText.equals("0")) {
                    MyFrame.oknoWynik.setText("poteguj(");
                } else {
                    MyFrame.oknoWynik.setText(oText + "poteguj(");
                    przecinek = false;
                }
            }
        }

    }

    void przecinek() {
        oText = MyFrame.oknoWynik.getText();
        if (ifEndsWithAllDzialanie()) {
            oText = MyFrame.oknoWynik.getText();
        } else {
            if (przecinek == false) {

                if (oText.equals("0")) {
                    MyFrame.oknoWynik.setText("0,");
                    przecinek = true;
                } else {
                    MyFrame.oknoWynik.setText(MyFrame.oknoWynik.getText() + MyFrame.bPrzecinek.getText());
                    przecinek = true;
                }

            }

        }
    }


}
