package h06;

import java.awt.*;
import java.applet.*;


public class Opdr_Drie_NegatieveInt extends Applet {
int positiveInt;
int positiveInt2;
int uitkomst;


    public void init() {
        positiveInt = 2147483647;
        positiveInt2 = 1;
        uitkomst = positiveInt + positiveInt2;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst,20,20);
    }
}
