package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Drie_Fibonacci extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        int teller;
        int X = 20;
        int nummer = 0;
        int vorigNummer = 0;
        int vorigNummer1 = 1;


        for(teller = 0; teller < 10; teller++){
            X += 20;
            g.drawString("" + nummer,X,60);
            nummer = vorigNummer + vorigNummer1;
            vorigNummer1 = vorigNummer;
            vorigNummer = nummer;
        }
    }

}
