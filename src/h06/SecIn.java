package h06;

import java.awt.*;
import java.applet.*;


public class SecIn extends Applet {
    int secInUur;
    int secInDag;
    int secInJaar;


    public void init() {
        secInUur = 60*60;
        secInDag = (60*60)*24;
        secInJaar = ((60*60)*24)*365;
    }

    public void paint(Graphics g) {
        g.drawString("Seconds in an hour: " + secInUur,20,20);
        g.drawString("Seconds in a day: " + secInDag,20,35);
        g.drawString("Seconds in a year: " + secInJaar,20,50);
    }
}
