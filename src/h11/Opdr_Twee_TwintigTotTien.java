package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Twee_TwintigTotTien extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        int teller;
        int Y = 20;

        for(teller = 20; teller > 10; teller--){
            Y += 20;
            g.drawString("" + teller,50,Y);
        }
    }

}
