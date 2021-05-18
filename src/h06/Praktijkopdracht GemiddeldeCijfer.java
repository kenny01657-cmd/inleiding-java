package h06;

import java.awt.*;
import java.applet.*;


public class GemiddeldeCijfer extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddeldeCijfer;
    int hoeveelheidCijfers;
    int x;
    int y;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        hoeveelheidCijfers = 3;
        gemiddeldeCijfer = ((cijfer1 + cijfer2 + cijfer3)/hoeveelheidCijfers)*10;
        gemiddeldeCijfer = (int) gemiddeldeCijfer;
        gemiddeldeCijfer = gemiddeldeCijfer/10;
        x = 20;
        y = 20;


    }

    public void paint(Graphics g) {
        g.drawString("Behaalde cijfers: " + cijfer1 + ", " + cijfer2 + ", " + cijfer3,x,y);
        g.drawString("Het gemiddelde is: " + gemiddeldeCijfer,x,y+15);
    }
}
