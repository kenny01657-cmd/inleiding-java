package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Acht_MeerCirkels extends Applet {

    public void init() {
        setSize(600,600);
    }

    public void paint(Graphics g){
        // Declareren en Initialiseren
        int teller;
        int X = 20;
        int Y = 20;
        int width = 5;
        int height = 5;

        // 100 cirkels
        for(teller = 0; teller < 100; teller++){
            width += 5;
            height += 5;
            g.drawOval(X,Y,width,height);
        }

    }

}
