package h06;

import java.awt.*;
import java.applet.*;


public class NegatieveInt extends Applet {
int positiveInt;
int positiveInt2;
int uitkomst;
int x;
int y;


    public void init() {
        positiveInt = 2147483647;
        positiveInt2 = 1;
        uitkomst = positiveInt + positiveInt2;
        x = 20;
        y = 20;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst,x,y);
    }
}
