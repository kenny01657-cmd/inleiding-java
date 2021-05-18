package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Een_VerticaleLijnen extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        int teller;
        int x = 10;

        for(teller = 0; teller < 10; teller++){
            x += 30;
            g.drawLine(x,20,x,250);
        }
    }
}
