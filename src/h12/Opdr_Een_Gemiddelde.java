package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Een_Gemiddelde extends Applet {
    double[] tabel;
    double berekening;

    public void init() {
        tabel = new double[10];
        int teller;
        for(teller = 0; teller < tabel.length; teller++){
            tabel[teller] = 420 * teller + 69;
        }
        berekening = (tabel[0] + tabel[1] + tabel[2] + tabel[3] + tabel[4] + tabel[5] + tabel[6] + tabel[7] + tabel[8] + tabel[9]) / tabel.length;

    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is: " + berekening,200,200);
        for(int i = 0; i < tabel.length; i++){
            g.drawString("" + tabel[i],50,20 * i + 20);
        }
    }

}
