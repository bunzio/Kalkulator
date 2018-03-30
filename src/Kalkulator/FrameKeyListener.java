import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrameKeyListener extends ButtonActionListener {

    FrameKeyListener() {
        super();
        addKeyListenerToAllComponents();

    }

    private void addKeyListenerToAllComponents() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button0.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        button9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bPrzecinek.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bCofnij.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bKasuj.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bOnawias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bZnawias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bDzielenie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bXdoN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bMnozenie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bDo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bPierwiastek.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bDodwanie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bOdejmowanie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bWynik.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        bPlusMinus.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });
        oknoWynik.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                button0_9KeyListener(e);
                buttonDzialanieKeyListener(e);
            }
        });

    }

    private void button0_9KeyListener(KeyEvent e) {
        if (e.getKeyChar() == '0')
            buttonAction(button0);
        if (e.getKeyChar() == '1')
            buttonAction(button1);
        if (e.getKeyChar() == '2')
            buttonAction(button2);
        if (e.getKeyChar() == '3')
            buttonAction(button3);
        if (e.getKeyChar() == '4')
            buttonAction(button4);
        if (e.getKeyChar() == '5')
            buttonAction(button5);
        if (e.getKeyChar() == '6')
            buttonAction(button6);
        if (e.getKeyChar() == '7')
            buttonAction(button7);
        if (e.getKeyChar() == '8')
            buttonAction(button8);
        if (e.getKeyChar() == '9')
            buttonAction(button9);


    }

    private void buttonDzialanieKeyListener(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            buttonCofnij();
        if (e.getKeyCode() == KeyEvent.VK_DELETE)
            buttonKasuj();
        if (e.getKeyChar() == '+')
            buttonDzialanieAction(bDodwanie);
        if (e.getKeyChar() == '-')
            buttonAction(bOdejmowanie);
        if (e.getKeyChar() == '*')
            buttonDzialanieAction(bMnozenie);
        if (e.getKeyChar() == '/')
            buttonDzialanieAction(bDzielenie);
        if (e.getKeyChar() == '(')
            buttonOnawias();
        if (e.getKeyChar() == ')')
            buttonZnawias();
        if (e.getKeyChar() == '=' || e.getKeyCode() == KeyEvent.VK_ENTER)
            wynik();
        if (e.getKeyChar() == ',')
            przecinek();
        if (e.getKeyChar() == '%')
            buttonDzialanieAction(bModulo);

    }


}
