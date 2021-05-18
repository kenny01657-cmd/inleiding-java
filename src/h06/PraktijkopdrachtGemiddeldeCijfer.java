package h06;

import java.awt.*;
import java.applet.*;


public class PraktijkopdrachtGemiddeldeCijfer extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddeldeCijfer;
    int hoeveelheidCijfers;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        hoeveelheidCijfers = 3;
        gemiddeldeCijfer = ((cijfer1 + cijfer2 + cijfer3)/hoeveelheidCijfers)*10;
        gemiddeldeCijfer = (int) gemiddeldeCijfer;
        gemiddeldeCijfer = gemiddeldeCijfer/10;


    }

    public void paint(Graphics g) {
        g.drawString("Behaalde cijfers: " + cijfer1 + ", " + cijfer2 + ", " + cijfer3,20,20);
        g.drawString("Het gemiddelde is: " + gemiddeldeCijfer,20,35);
    }
}
