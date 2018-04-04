import Frame.ButtonActionListener;
import Frame.FrameKeyListener;
import Frame.MyFrame;

/**
 * Created by Bunzio on 20.03.2018
 * Contact: bunzeladam@gmail.com
 */

public class KalkulatorApplication {
    public static void main(String[] args) {
        MyFrame okno = new MyFrame();
        ButtonActionListener buttonActionListener = new ButtonActionListener(okno);
        buttonActionListener.createButtonActionListener();
        FrameKeyListener frameKeyListener = new FrameKeyListener(okno, buttonActionListener);
        frameKeyListener.addKeyListenerToAllComponents();

    }


}
