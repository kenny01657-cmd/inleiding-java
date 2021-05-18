package h06;

import java.awt.*;
import java.applet.*;


public class SecIn extends Applet {
    int secInUur;
    int secInDag;
    int secInJaar;
    int x;
    int y;


    public void init() {
        secInUur = 60*60;
        secInDag = (60*60)*24;
        secInJaar = ((60*60)*24)*365;
        x = 20;
        y = 20;
    }

    public void paint(Graphics g) {
        g.drawString("Seconds in an hour: " + secInUur,x,y);
        g.drawString("Seconds in a day: " + secInDag,x,y+15);
        g.drawString("Seconds in a year: " + secInJaar,x,y+30);
    }
}
