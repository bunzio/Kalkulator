package Frame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Bunzio on 20.03.2018
 * Contact: bunzeladam@gmail.com
 */

public class FrameKeyListener {
    private MyFrame MyFrame;
    private ButtonActionListener ButtonActionListener;

    public FrameKeyListener(MyFrame MyFrame, ButtonActionListener ButtonActionListener ) {
        this.MyFrame = MyFrame;
        this.ButtonActionListener = ButtonActionListener;


    }

    public void addKeyListenerToAllComponents() {
        MyFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button0.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.button9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bPrzecinek.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bCofnij.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bKasuj.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bOnawias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bZnawias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bDzielenie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bXdoN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bMnozenie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bDo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bPierwiastek.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bDodwanie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bOdejmowanie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bWynik.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.bPlusMinus.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        MyFrame.oknoWynik.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });

    }

    private void button0_9KeyListener(KeyEvent e) {
        if (e.getKeyChar() == '0')
            ButtonActionListener.buttonAction(MyFrame.button0);
        if (e.getKeyChar() == '1')
            ButtonActionListener.buttonAction(MyFrame.button1);
        if (e.getKeyChar() == '2')
            ButtonActionListener.buttonAction(MyFrame.button2);
        if (e.getKeyChar() == '3')
            ButtonActionListener.buttonAction(MyFrame.button3);
        if (e.getKeyChar() == '4')
            ButtonActionListener.buttonAction(MyFrame.button4);
        if (e.getKeyChar() == '5')
            ButtonActionListener.buttonAction(MyFrame.button5);
        if (e.getKeyChar() == '6')
            ButtonActionListener.buttonAction(MyFrame.button6);
        if (e.getKeyChar() == '7')
            ButtonActionListener.buttonAction(MyFrame.button7);
        if (e.getKeyChar() == '8')
            ButtonActionListener.buttonAction(MyFrame.button8);
        if (e.getKeyChar() == '9')
            ButtonActionListener.buttonAction(MyFrame.button9);


    }

    private void buttonDzialanieKeyListener(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            ButtonActionListener.buttonCofnij();
        if (e.getKeyCode() == KeyEvent.VK_DELETE)
            ButtonActionListener.buttonKasuj();
        if (e.getKeyChar() == '+')
            ButtonActionListener.buttonDzialanieAction(MyFrame.bDodwanie);
        if (e.getKeyChar() == '-')
            ButtonActionListener.buttonAction(MyFrame.bOdejmowanie);
        if (e.getKeyChar() == '*')
            ButtonActionListener.buttonDzialanieAction(MyFrame.bMnozenie);
        if (e.getKeyChar() == '/')
            ButtonActionListener.buttonDzialanieAction(MyFrame.bDzielenie);
        if (e.getKeyChar() == '(')
            ButtonActionListener.buttonOnawias();
        if (e.getKeyChar() == ')')
            ButtonActionListener.buttonZnawias();
        if (e.getKeyChar() == '=' || e.getKeyCode() == KeyEvent.VK_ENTER)
            ButtonActionListener.wynik();
        if (e.getKeyChar() == ',')
            ButtonActionListener.przecinek();
        if (e.getKeyChar() == '%')
            ButtonActionListener.buttonDzialanieAction(MyFrame.bModulo);

    }


}
