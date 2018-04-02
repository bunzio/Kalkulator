package Frame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bunzio on 02.04.2018
 * Contact: bunzeladam@gmail.com
 */
class ButtonActionListenerTest {
    private MyFrame myFrame = new MyFrame();
    private ButtonActionListener buttonActionListener = new ButtonActionListener(myFrame);

    @Test
    void ifEndsWithTest() {

        myFrame.oknoWynik.setText("!");
        assertTrue(buttonActionListener.ifEndsWithAllDzialanie());
        myFrame.oknoWynik.setText("1");
        assertFalse(buttonActionListener.ifEndsWithAllDzialanie());
    }

    @Test
    void buttonActionTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "5";
        buttonActionListener.buttonAction(myFrame.button5);
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("123");
        expect = "1235";
        buttonActionListener.buttonAction(myFrame.button5);
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void buttonDzialanieActionTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "0";
        buttonActionListener.buttonDzialanieAction(myFrame.bDodwanie);
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("4");
        expect = "4+";
        buttonActionListener.buttonDzialanieAction(myFrame.bDodwanie);
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void buttonCofnijTest() {
        myFrame.oknoWynik.setText("0");
        buttonActionListener.buttonCofnij();
        String expect = "0";
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("1");
        buttonActionListener.buttonCofnij();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("312");
        expect = "31";
        buttonActionListener.buttonCofnij();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void buttonKasujTest() {
        myFrame.oknoWynik.setText("2132133213");
        String expect = "0";
        buttonActionListener.buttonKasuj();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void buttonOnawiasTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "(";
        buttonActionListener.buttonOnawias();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("666");
        buttonActionListener.buttonOnawias();
        expect = "666*(";
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("666+");
        expect = "666+(";
        buttonActionListener.buttonOnawias();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void buttonZnawiasTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "0";
        buttonActionListener.buttonZnawias();
        ;
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("666");
        buttonActionListener.buttonZnawias();
        expect = "666)";
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("666+");
        expect = "666+";
        buttonActionListener.buttonZnawias();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void ifEndsWithDzialanieTest() {
        myFrame.oknoWynik.setText("3132+");
        assertTrue(buttonActionListener.ifEndsWithDzialanie());
        myFrame.oknoWynik.setText("321312*(");
        assertFalse(buttonActionListener.ifEndsWithDzialanie());

    }

    @Test
    void ifLastNumberTest() {
        myFrame.oknoWynik.setText("31231+");
        assertFalse(buttonActionListener.ifLastNumber());
        myFrame.oknoWynik.setText("321312");
        assertTrue(buttonActionListener.ifLastNumber());
    }

    @Test
    void buttonPierwiastekTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "√(";
        buttonActionListener.buttonPierwiastek();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("6666");
        expect = "6666*√(";
        buttonActionListener.buttonPierwiastek();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("56+");
        expect = "56+√(";
        buttonActionListener.buttonPierwiastek();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void wynikTest() {
        myFrame.oknoWynik.setText("3+3-3*3,3123*(5+6)÷3*√(6)+poteguj(3do3)");
        String expect = "-56.24789362522792";
        buttonActionListener.wynik();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void xDoNTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "poteguj(";
        buttonActionListener.xDoN();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("5");
        expect = "5*poteguj(";
        buttonActionListener.xDoN();
        assertEquals(expect, myFrame.oknoWynik.getText());
        myFrame.oknoWynik.setText("55+");
        expect = "55+poteguj(";
        buttonActionListener.xDoN();
        assertEquals(expect, myFrame.oknoWynik.getText());
    }

    @Test
    void przecinekTest() {
        myFrame.oknoWynik.setText("0");
        String expect = "0,";
        buttonActionListener.przecinek();
        assertEquals(expect, myFrame.oknoWynik.getText());
        buttonActionListener.buttonKasuj();
        myFrame.oknoWynik.setText("55");
        expect = "55,";
        buttonActionListener.przecinek();
        assertEquals(expect, myFrame.oknoWynik.getText());

    }
}